package com.bingo.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bingo.server.po.ItemDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDetailMapper extends BaseMapper<ItemDetail> {

    @Select("select * from checkitemdetailed where ciId=#{ciId}")
    List<ItemDetail> selectByCiId(Integer ciId);
}
