package com.bingo.server.mapper;

import com.bingo.server.po.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectItemsMapper {

    List<Item> getItemsByProjectId(String smId);
}
