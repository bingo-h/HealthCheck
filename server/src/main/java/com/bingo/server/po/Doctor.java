package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("doc")
@TableName("doctor")
public class Doctor {

	@TableId
	private Integer docId;
	
	private String docCode;
	
	private String realName;
	
	private String password;
	
	private Integer sex;
	
	private Integer deptno;
	
}
