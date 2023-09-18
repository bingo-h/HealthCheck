package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("user")
@TableName(value = "users", autoResultMap = true)
public class User {

	@TableId
	private String userId;
	
	private String password;
	
	private String realName;
	
	private Integer sex;

	private String identityCard;
	
	private String birthday;
	
	private Integer userType;

	private String salt;

}
