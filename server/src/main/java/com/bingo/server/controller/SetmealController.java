package com.bingo.server.controller;

import com.bingo.server.mapper.SetmealMapper;
import com.bingo.server.po.Setmeal;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/project")
public class SetmealController {

    @Resource
    private SetmealMapper setmealMapper;

    private final Map<String, Object> map = new HashMap<>();

    @RequestMapping("/select")
    public List<Setmeal> getProjectsByType(@RequestBody Setmeal setmeal) {
        map.put("type", setmeal.getType());
        return setmealMapper.selectByMap(map);
    }

    @RequestMapping("/get")
    public Setmeal getProjectById(@RequestBody Setmeal setmeal) {
        return setmealMapper.selectById(setmeal.getSmId());
    }
}
