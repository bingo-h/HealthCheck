package com.bingo.server.po;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("detail")
public class ProjectDetails {

	private Integer ciId;
	
	private String ciName;
	
	private String ciContent;
	
	private String meaning;
	
	private String remarks;

}
