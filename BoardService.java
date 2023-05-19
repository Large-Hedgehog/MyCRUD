package com.green.myboard1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private final BoardMapper mapper;

    @Autowired
    public BoardService(BoardMapper mapper){
        this.mapper = mapper;
    }


    public int insBoard(BoardEntity entity){
        System.out.println("ins-Board");
        mapper.insBoard(entity);
        return 1;
    }

    public List<BoardEntity>selBoardAll(){
        return mapper.selBoardAll();
    }
    public BoardEntity selBoardById(BoardEntity entity) {
        return mapper.selBoardById(entity);
    }


    public int updBoard(BoardEntity entity){
        System.out.println("service-updBoard");
        mapper.updBoard(entity);
        return 1;
    }

    public int delBoard(BoardEntity entity) {
        return mapper.delBoard(entity);
    }


}
