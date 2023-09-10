package com.bingo.server.mapper;

import com.bingo.server.dto.CalendarResponseDto;
import com.bingo.server.dto.OrderMapperDto;
import com.bingo.server.po.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

	@Select("select count(*) from orders where userId=#{userId} and state=1")
	Integer getOrdersDoneByUserId(String userId);

	List<CalendarResponseDto> listOrdersNumber(List<OrderMapperDto> list);

	List<Order> listOrdersByUserId(Integer userId);

	@Insert("insert into orders(orderDate,userId,hpId,smId,state) values (#{orderDate},#{userId},#{hpId},#{smId},#{state})")
	Integer saveOrder(Order order);
}
