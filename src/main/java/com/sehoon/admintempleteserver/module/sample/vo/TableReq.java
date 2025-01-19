package com.sehoon.admintempleteserver.module.sample.vo;

import com.sehoon.admintempleteserver.common.pagination.ReqPagination;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class TableReq extends ReqPagination {
    int category;
    String start;
    String end;

    public TableReq(int page, int pageSize, int category, String start, String end) {
        super(page, pageSize);
        this.category = category;
        this.start = start;
        this.end = end;
    }
}