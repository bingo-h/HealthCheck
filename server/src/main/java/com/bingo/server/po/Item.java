package com.bingo.server.po;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("item")
public class Item {

	private Integer ciId;
	
	private String ciName;
	
	private String ciContent;
	
	private String meaning;
	
	private String remarks;

}
