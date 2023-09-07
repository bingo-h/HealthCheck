package com.bingo.server.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bingo.server.po.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from users where userId=#{userId} and password=#{password}")
	public User getUsers_ByUserId_ByPassword(User user);
	
	@Select("select * from users where userId=#{userId}")
	public User getUsers_ByUserId(String userId);
	 
	@Insert("insert into users values(#{userId},#{password},#{realName},#{sex},"
			+ "#{identityCard},#{birthday},#{userType})")
	public int saveUser(User user);
}
