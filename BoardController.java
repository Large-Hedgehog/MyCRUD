package com.green.myboard1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/myboard1")
public class BoardController {
    private final BoardService service;

    @Autowired
    public BoardController(BoardService service){
        this.service = service;
    }

    @GetMapping
    public List<BoardEntity> boardGetAll(){
        return service.selBoardAll();
    }

    @PostMapping
    public int boardPost(@RequestBody BoardEntity entity){
        System.out.println(entity);
        return service.insBoard(entity);
    }

    @PutMapping
    public int putBoard(@RequestBody BoardEntity entity){
        System.out.println(entity);
        return service.updBoard(entity);
    }

    @DeleteMapping("/{idx}")
    public int delBoard(@PathVariable int idx){
        BoardEntity entity = new BoardEntity();
        entity.setIdx(idx);
        System.out.println(entity);
        return service.delBoard(entity);
    }


    @GetMapping("/{idx}")
    public BoardEntity boardGetById(@PathVariable int idx) {
        BoardEntity entity = new BoardEntity();
        entity.setIdx(idx);
        return service.selBoardById(entity);
    }


}
