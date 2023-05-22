package com.green.board7;

import com.green.board7.BoardMapper;
import com.green.board7.model.BoardDetailVo;
import com.green.board7.model.BoardDto;
import com.green.board7.model.BoardInsDto;
import com.green.board7.model.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper mapper;

    @Autowired
    public BoardService(BoardMapper mapper){
        this.mapper = mapper;
    }
    // 객체 주소값을 가져온다

    public int insBoard(BoardInsDto dto){
        return mapper.insBoard(dto);
        // 리턴값 : 영향받은 행 갯수
    }

    public int updBoard(BoardDto dto){
        return mapper.updBoard(dto);
    }

    public int delBoard(BoardDto dto){
        return mapper.delBoard(dto);
    }

    public List<BoardVo> selBoardAll(){
        return mapper.selBoardAll();
    }

    public BoardDetailVo selBoardById(BoardDto dto){
        return mapper.selBoardById(dto);
    }

}
