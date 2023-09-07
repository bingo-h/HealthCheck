package com.bingo.server.po;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("doc")
public class Doctor {

	private Integer docId;
	
	private String docCode;
	
	private String realName;
	
	private String password;
	
	private Integer sex;
	
	private Integer deptno;
	
}
