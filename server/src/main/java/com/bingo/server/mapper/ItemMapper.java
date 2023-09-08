package com.bingo.server.mapper;

import com.bingo.server.po.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ItemMapper {

    @Select("select * from checkitem where ciId=#{ciId}")
    Item getItemById(Integer ciId);
}
