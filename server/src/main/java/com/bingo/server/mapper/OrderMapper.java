package com.bingo.server.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

	@Select("select count(*) from orders where userId=#{userId} and state=1")
	Integer getOrdersDoneByUserId(String userId);
}
