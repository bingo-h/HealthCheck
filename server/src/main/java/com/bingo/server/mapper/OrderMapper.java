package com.bingo.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bingo.server.dto.CalendarResponseDto;
import com.bingo.server.dto.OrderMapperDto;
import com.bingo.server.po.Order;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper extends BaseMapper<Order> {
	List<CalendarResponseDto> listOrdersNumber(List<OrderMapperDto> list);
}
