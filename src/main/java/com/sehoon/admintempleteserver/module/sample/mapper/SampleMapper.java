package com.sehoon.admintempleteserver.module.sample.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {

    Map<String, Object> selectSampleById(int id);
}