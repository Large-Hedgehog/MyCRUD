package com.green.board7.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardVo {
    private int idx;
    private String title;
    private String writer;
    private String createdAt;
}
