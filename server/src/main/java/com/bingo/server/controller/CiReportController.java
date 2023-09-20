package com.bingo.server.controller;

import com.bingo.server.mapper.CiDetailedReportMapper;
import com.bingo.server.mapper.CiReportMapper;
import com.bingo.server.mapper.OverallResultMapper;
import com.bingo.server.po.CiDetailedReport;
import com.bingo.server.po.CiReport;
import com.bingo.server.po.Order;
import com.bingo.server.po.OverallResult;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/report")
public class CiReportController {

    @Resource
    private CiReportMapper ciReportMapper;

    @Resource
    private CiDetailedReportMapper ciDetailedReportMapper;

    @Resource
    private OverallResultMapper overallResultMapper;

    private Map<String, Object> map = new HashMap<>();

    @RequestMapping("/get")
    public List<CiReport> getReportByOrderId(@RequestBody String orderId) {
        orderId = orderId.substring(0, orderId.length() - 1);
        map.put("orderId", Integer.parseInt(orderId));

        return ciReportMapper.selectByMap(map);
    }

    @RequestMapping("/getdetail")
    public List<CiDetailedReport> getDetailsByOrderId(@RequestBody String orderId) {
        orderId = orderId.substring(0, orderId.length() - 1);
        map.put("orderId", Integer.parseInt(orderId));
        return ciDetailedReportMapper.selectByMap(map);
    }

    @RequestMapping("/getoverall")
    public List<OverallResult> getOverallResultByOrderId(@RequestBody String orderId) {
        map.put("orderId", orderId);
        return overallResultMapper.selectByMap(map);
    }
}
