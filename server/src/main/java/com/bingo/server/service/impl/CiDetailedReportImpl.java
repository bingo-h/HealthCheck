package com.bingo.server.service.impl;

import com.bingo.server.mapper.CiDetailedReportMapper;
import com.bingo.server.po.CiDetailedReport;
import com.bingo.server.service.CiDetailedReportService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CiDetailedReportImpl implements CiDetailedReportService {

    @Resource
    private CiDetailedReportMapper ciDetailedReportMapper;

    private final Map<String, Object> map = new HashMap<>();

    @Override
    public List<CiDetailedReport> selectByOrderIdCiId(Integer ciId, Integer orderId) {
        map.put("ciId", ciId);
        map.put("orderId", orderId);
        return ciDetailedReportMapper.selectByMap(map);
    }
}
