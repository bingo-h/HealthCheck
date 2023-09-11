package com.bingo.server.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bingo.server.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select * from users where userId=#{userId} and password=#{password}")
	User getUsersByUserIdByPassword(User user);

    @Select("select * from users where userId=#{userId}")
    User getUsersByUserId(String userId);

    @Insert("insert into users values(#{userId},#{password},#{realName},#{sex},#{identityCard}," +
            "#{birthday},#{userType})")
    int saveUser(User user);
}
