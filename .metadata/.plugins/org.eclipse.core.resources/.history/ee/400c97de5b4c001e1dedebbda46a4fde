package com.bingo.server.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bingo.server.po.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from users where userId=#{userId} and password=#{password}")
	public User getUsers_ByUserId_ByPassword(User user);
}
