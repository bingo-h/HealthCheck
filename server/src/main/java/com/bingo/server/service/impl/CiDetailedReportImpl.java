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

    private Map<String, Object> map = new HashMap<>();

    @Override
    public List<CiDetailedReport> selectByCiId(Integer ciId) {
        map.put("ciId", ciId);
        return ciDetailedReportMapper.selectByMap(map);
    }
}
