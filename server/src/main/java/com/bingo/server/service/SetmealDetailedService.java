package com.bingo.server.service;

import com.bingo.server.po.Item;

import java.util.List;

public interface SetmealDetailedService {

    List<Item> getItemsBySmId(Integer smId);
}
