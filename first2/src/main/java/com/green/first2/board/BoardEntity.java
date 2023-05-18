package com.green.first2.board;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
@ToString
public class BoardEntity {

    private int iboard;
    private String title;
    private String ctnt;
    private String writer;
    private String createdAt;
    private String updatedAt;

}
