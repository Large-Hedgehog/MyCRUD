package com.green.myboard1;

import lombok.Data;

@Data
public class BoardEntity {
    private int idx;
    private String title;
    private String ctnt;
    private String writer;
    private String memo;
    private String createdAt;
    private String updatedAt;
}
