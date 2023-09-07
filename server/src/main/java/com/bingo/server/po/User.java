package com.bingo.server.po;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("user")
public class User {
	private String userId;
	
	private String password;
	
	private String realName;
	
	private Integer sex;
	
	private String identityCard;
	
	private String birthday;
	
	private Integer userType;
}
