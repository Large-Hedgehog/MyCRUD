package com.green.myboard1;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    void insBoard(BoardEntity entity);
    List<BoardEntity> selBoardAll();
    BoardEntity selBoardById(BoardEntity entity);
    void updBoard(BoardEntity entity);
    int delBoard(BoardEntity entity);
}
