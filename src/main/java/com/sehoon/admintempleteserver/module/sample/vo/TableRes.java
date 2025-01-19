package com.sehoon.admintempleteserver.module.sample.vo;

import java.util.List;

import lombok.Data;

@Data
public class TableRes {
    List<TableItem> items;
    int total;
}