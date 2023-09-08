package com.bingo.server.po;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("projectitem")
public class ProjectItem {

	private Integer sdId;
	
	private Integer smId;
	
	private Integer ciId;

	private Item item;
}
