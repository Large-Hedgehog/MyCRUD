package com.green.board1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;
    @Autowired
    public BoardController(BoardService service){
        this.service = service;
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

    @DeleteMapping("/{iboard}")
    public int delBoard(@PathVariable int iboard){
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard);
        System.out.println(entity);
        return service.delBoard(entity);
    }

    @GetMapping
    public List<BoardEntity> boardGetAll(){
        return service.selBoardAll();
    }

    @GetMapping("/{iboard}")
    public BoardEntity selBoardById(@PathVariable int iboard){
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard);
        return service.selBoardById(entity);
    }
}
