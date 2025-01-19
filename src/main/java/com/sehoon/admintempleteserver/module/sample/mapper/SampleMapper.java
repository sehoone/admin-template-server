package com.sehoon.admintempleteserver.module.sample.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SampleMapper {

    Map<String, Object> selectSampleById(int id);

    Map<String, Object> selectDummyTableList(
            @Param("offset") int offset,
            @Param("pageSize") int pageSize,
            @Param("category") Integer category,
            @Param("start") String start,
            @Param("end") String end);
}