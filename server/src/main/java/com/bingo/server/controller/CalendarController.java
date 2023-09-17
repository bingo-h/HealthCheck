package com.bingo.server.controller;

import com.baomidou.mybatisplus.core.toolkit.sql.SqlInjectionUtils;
import com.bingo.server.dto.CalendarRequestDto;
import com.bingo.server.dto.CalendarResponseDto;
import com.bingo.server.service.CalendarService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @Resource
    private CalendarService calendarService;

    @RequestMapping("/getcalendar")
    public List<CalendarResponseDto> getCalendar(@RequestBody CalendarRequestDto calendarRequestDto) {
        SqlInjectionUtils.check(calendarRequestDto.toString());
        return calendarService.getCalendar(calendarRequestDto);
    }
}
