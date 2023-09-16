package com.bingo.server.service.impl;

import com.bingo.server.dto.CalendarRequestDto;
import com.bingo.server.dto.CalendarResponseDto;
import com.bingo.server.dto.OrderMapperDto;
import com.bingo.server.mapper.HospitalMapper;
import com.bingo.server.mapper.OrderMapper;
import com.bingo.server.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    HospitalMapper hospitalMapper;

    @Override
    public List<CalendarResponseDto> getCalendar(CalendarRequestDto calendarRequestDto) {

        //获取预约日期列表
        List<CalendarResponseDto> monthCalendarList = getCalendarList(calendarRequestDto.getHpId());

        //获取当前日历（当前日历中只有ymd属性，total、existing、remainder需要从calendarList获取）
        List<CalendarResponseDto> currentCalendarList = getCurrentCalendarList(calendarRequestDto.getYear(), calendarRequestDto.getMonth());

        //给当前日历填充total、existing、remainder属性
        for (CalendarResponseDto current : currentCalendarList) {
            for (CalendarResponseDto calendar : monthCalendarList) {
                if (current.getDate() != null) {
                    if (current.getDate().equals(calendar.getDate())) {
                        current.setMaximum(calendar.getMaximum());
                        current.setExist(calendar.getExist());
                        current.setRemain(calendar.getRemain());
                    }
                } else continue;
            }
        }

        return currentCalendarList;
    }

    private List<CalendarResponseDto> getCalendarList(Integer hpId) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();

        //做一个临时集合，作为去Orders表中查询的参数
        List<OrderMapperDto> paramList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            OrderMapperDto orderMapperDto = new OrderMapperDto();
            calendar.add(Calendar.DATE, 1); //计算1天后的时间
            orderMapperDto.setDate(simpleDateFormat.format(calendar.getTime()));
            orderMapperDto.setHpId(hpId);
            paramList.add(orderMapperDto);
        }

        //根据parameList参数，查询30天预约日期中，每一天的已预约人数
        //查询结果CalendarResponseDto中只有两个属性：ymd、existing，还有两个属性需要填充：total、remainder
        List<CalendarResponseDto> monthCalendarList = orderMapper.listOrdersNumber(paramList);

        //根据医院编号，获取预约规则，就能获取每天最多预约人数
        String[] strArr = hospitalMapper.selectById(hpId).getRule().split(",");


        //继续填充calendarList30返回值中的total、remainder属性
        for (CalendarResponseDto day : monthCalendarList) {
            //将预约日期转换为Calendar对象
            try {
                calendar.setTime(simpleDateFormat.parse(day.getDate()));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            //通过Calendar对象的get方法获取某天为星期几，就可以通过预约规则数组获取某天的总预约人数
            int total = Integer.parseInt(strArr[calendar.get(Calendar.DAY_OF_WEEK) - 1]);

            //填充total属性
            day.setMaximum(total);

            //填充remainder属性
            day.setRemain(total - day.getExist());
        }

        return monthCalendarList;
    }

    //获取当前年和当前月的日历
    private List<CalendarResponseDto> getCurrentCalendarList(Integer year, Integer month) {
        List<CalendarResponseDto> currentCalendar = new ArrayList<>();

        //做万年历
        boolean isRun = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //计算从1900-01-01到现在的天数
        int totalDays = 0;
        for (int i = 1900; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        int beforeDays = 0;
        int currentDays = 0;
        for (int j = 1; j <= month; j++) {
            switch (j) {
                case 1, 3, 5, 7, 8, 10, 12 -> currentDays = 31;
                case 4, 6, 9, 11 -> currentDays = 30;
                case 2 -> {
                    if (isRun) {
                        currentDays = 29;
                    } else {
                        currentDays = 28;
                    }
                }
            }
            if (j < month) {
                beforeDays += currentDays;
            }
        }

        totalDays += beforeDays;
        int firstDayOfMonth = totalDays % 7 + 1;
        if (firstDayOfMonth == 7) {
            firstDayOfMonth = 0;
        }

        for (int k = 0; k < firstDayOfMonth; k++) {
            currentCalendar.add(new CalendarResponseDto());
        }

        for (int i = 1; i <= currentDays; i++) {
            String m = month < 10 ? "0" + month : month + "";
            String d = i < 10 ? "0" + i : i + "";
            String test = year + "-" + m + "-" + d;
            currentCalendar.add(new CalendarResponseDto(test));
        }

        return currentCalendar;
    }
}
