package com.sehoon.admintempleteserver.module.sample.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sehoon.admintempleteserver.module.sample.vo.TableItem;

@Mapper
public interface SampleMapper {

    Map<String, Object> selectSampleById(int id);

    List<TableItem> selectDummyTableList(
            @Param("offset") int offset,
            @Param("pageSize") int pageSize,
            @Param("category") Integer category,
            @Param("start") String start,
            @Param("end") String end);
}