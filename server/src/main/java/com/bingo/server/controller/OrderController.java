package com.bingo.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bingo.server.mapper.OrderMapper;
import com.bingo.server.po.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.server.po.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    private final Map<String, Object> map = new HashMap<>();

    @RequestMapping("/done")
    public int getOrdersDoneByUserId(@RequestBody User user) throws ParseException {
        int count = 0;

        map.put("userId", user.getUserId());
        map.put("state", 1);

        List<Order> orders = orderMapper.selectByMap(map);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Order order : orders) {
            Date orderDate = dateFormat.parse(order.getOrderDate());
            Date curDate = dateFormat.parse(String.valueOf(LocalDate.now()));
            if (curDate.after(orderDate)) {
                order.setState(2);
                orderMapper.updateById(order);
            } else count++;
        }

        return count;
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
