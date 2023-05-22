package com.green.board7;


import com.green.board7.model.BoardDetailVo;
import com.green.board7.model.BoardDto;
import com.green.board7.model.BoardInsDto;
import com.green.board7.model.BoardVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;

import java.util.List;
@Tag(name = "게시판" , description = "게시판 CRUD")
@RestController
@RequestMapping("/")
public class BoardController {
    // CRUD
    private final Logger LOGGER;
    private final BoardService service;


    @Autowired
    public BoardController(BoardService service){
        LOGGER = LoggerFactory.getLogger(BoardController.class);
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "글등록", description = "글을 등록할 수 있습니다"
    + "title : 제목 <br>"
    + "ctnt : 내용 <br>"
    + "writer : 작성자 <br>"
    + "memo : 메모 <br>")
    public int postBoard(@RequestBody BoardInsDto dto){
        LOGGER.warn("경고. 글 등록이 됩니다");
        return service.insBoard(dto);
    }

    @PutMapping
    public int putBoard(@RequestBody BoardDto Insdto){
        return service.updBoard(Insdto);
    }

    @DeleteMapping("/{idx}")
    public int delBoard(@PathVariable int idx){
        BoardDto dto = new BoardDto();
        dto.setIdx(idx);
        return service.delBoard(dto);
    }

    @GetMapping
    public List<BoardVo> getBoard(){
        return service.selBoardAll();
    }

    @GetMapping("/{idx}")
    public BoardDetailVo getBoardById(@PathVariable int idx){
        BoardDto dto = new BoardDto();
        dto.setIdx(idx);

        LOGGER.info(dto.toString());
        return service.selBoardById(dto);
    }

}
