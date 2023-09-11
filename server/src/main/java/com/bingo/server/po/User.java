package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("user")
@TableName("users")
public class User {

	@TableId
	private String userId;
	
	private String password;
	
	private String realName;
	
	private Integer sex;
	
	private String identityCard;
	
	private String birthday;
	
	private Integer userType;
}
