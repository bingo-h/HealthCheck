package com.bingo.server.po;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Getter
@Setter
@Alias("project")
public class Project {

	private Integer smId;
	
	private String name;
	
	private Integer type;
	
	private Integer price;

	private List<Item> itemList;

}
