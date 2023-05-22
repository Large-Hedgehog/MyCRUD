package com.green.board7.model;


import lombok.Data;

@Data
public class BoardEntity {
    // db테이블과 1:1 매핑되게 작성

    private int idx;
    private String title;
    private String ctnt;
    private String writer;
    private String memo;
    private String createdAt;
    private String updatedAt;
}
