package com.bingo.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bingo.server.mapper.OrderMapper;
import com.bingo.server.po.Order;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.po.User;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderMapper orderMapper;

    private final Map<String, Object> map = new HashMap<>();

    @RequestMapping("/done")
    public Long countOrdersDoneByUserId(@RequestBody User user) {
        map.put("userId", user.getUserId());
        map.put("state", 1);
        QueryWrapper<Order> wrapper = new QueryWrapper<>();
        wrapper.allEq(map);

        return orderMapper.selectCount(wrapper);
    }

    @RequestMapping("/getfinished")
    public List<Order> getOrdersByState(@RequestBody User user) {
        map.put("userId", user.getUserId());
        map.put("state", 2);
        return orderMapper.selectByMap(map);
    }

    @RequestMapping("/save")
    public int saveOrder(@RequestBody Order order) {
        return orderMapper.insert(order);
    }

    @RequestMapping("/getall")
    public List<Order> getOrdersByUserId(@RequestBody User user) {
        map.put("userId", user.getUserId());
        return orderMapper.selectByMap(map);
    }

    @RequestMapping("/del")
    public int delOrderById(@RequestBody Order order) {
        return orderMapper.deleteById(order.getOrderId());
    }
}
