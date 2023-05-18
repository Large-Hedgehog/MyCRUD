package com.green.first.work;


//bean 등록
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
public class WorkController{

    @GetMapping ("/work1")
    public String work1(){
        return "work1";
    }
}
