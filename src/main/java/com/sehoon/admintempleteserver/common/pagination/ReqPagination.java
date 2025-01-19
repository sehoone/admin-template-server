package com.sehoon.admintempleteserver.common.pagination;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReqPagination {
    private int page;
    private int pageSize;

    public ReqPagination(int page, int pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return (page - 1) * pageSize;
    }
}