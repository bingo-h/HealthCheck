package com.bingo.server.service.impl;

import com.bingo.server.mapper.SetmealDetailedMapper;
import com.bingo.server.po.Item;
import com.bingo.server.service.SetmealDetailedService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetmealDetailedImpl implements SetmealDetailedService {

    @Resource
    private SetmealDetailedMapper setmealDetailedMapper;

    @Override
    public List<Item> getItemsBySmId(Integer smId) {
        return setmealDetailedMapper.getItemsBySmId(smId);
    }
}
