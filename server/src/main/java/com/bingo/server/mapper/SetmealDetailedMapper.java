package com.bingo.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bingo.server.po.Item;
import com.bingo.server.po.SetmealDetailed;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SetmealDetailedMapper extends BaseMapper<SetmealDetailed> {

    List<Item> getItemsBySmId(Integer smId);
}
