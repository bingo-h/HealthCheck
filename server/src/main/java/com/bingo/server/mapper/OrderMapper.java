package com.bingo.server.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {

	@Select("select count(*) from orders where userId=#{userId} and state=1")
	public int getOrdersDoneByUserId(String userId);
}
