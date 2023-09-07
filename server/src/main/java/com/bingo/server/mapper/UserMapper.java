package com.bingo.server.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bingo.server.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
	
	User getUsers_ByUserId_ByPassword(User user);
	
    User getUsers_ByUserId(String userId);
	 
    int saveUser(User user);
}
