package com.bingo.server.service;

import com.bingo.server.po.CiDetailedReport;

import java.util.List;

public interface CiDetailedReportService {

    List<CiDetailedReport> selectByCiId(Integer ciId);
}
