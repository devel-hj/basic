package com.demo.basic.controller;

import org.springframework.web.bind.annotation.*;

@RestController // 어노테이션
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "안녕하세요~ 서버입니다.";
    }

    @GetMapping("/")
    public String home(){
        return "기본 서버입니다.";
    }

    @PostMapping("/post")
    public String savePost(){
        return "글이 잘 저장되었습니다.";
    }

    @PutMapping("/post/update")
    public String updatePost(){
        return "글이 수정되었습니다.";
    }

    @DeleteMapping("/post/del")
    public String deletePost(){
        return "잘 삭제되었습니다.";
    }
}
