package com.sehoon.admintempleteserver.module.sample.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.sehoon.admintempleteserver.common.pagination.ReqPagination;
import com.sehoon.admintempleteserver.module.sample.mapper.SampleMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * SampleService.java
 * <br/>
 * 샘플 유저 service
 * 
 * @author : SeHoon
 * @version : 1.0
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class SampleService {

    private final SampleMapper sampleMapper;

    public Map<String, Object> getSampleById(int id) {
        log.debug("getSampleById start");
        return sampleMapper.selectSampleById(id);
    }

    public Map<String, Object> getDummyTableList(ReqPagination pagination, Integer category, String start, String end) {
        return sampleMapper.selectDummyTableList(pagination.getOffset(), pagination.getPageSize(), category, start, end);
    }
}
