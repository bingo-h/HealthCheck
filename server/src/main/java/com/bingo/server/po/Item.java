package com.bingo.server.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Data
@Alias("item")
@TableName("checkitem")
public class Item {

	@TableId
	private Integer ciId;
	
	private String ciName;
	
	private String ciContent;
	
	private String meaning;
	
	private String remarks;

}
