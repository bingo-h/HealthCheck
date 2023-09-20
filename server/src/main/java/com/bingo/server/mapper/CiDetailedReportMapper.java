package com.bingo.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bingo.server.po.CiDetailedReport;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CiDetailedReportMapper extends BaseMapper<CiDetailedReport> {

    @Select("select * from cidetailedreport where ciId=#{ciId} and orderId=#{orderId}")
    List<CiDetailedReport> selectByCiId(Integer ciId, Integer orderId);
}
