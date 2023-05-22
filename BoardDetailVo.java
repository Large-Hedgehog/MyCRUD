package com.green.board7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class BoardDetailVo {
    private int idx;
    private String title;
    private String ctnt;
    private String writer;
    private String memo;
    private String createdAt;
    private String updatedAt;
}

