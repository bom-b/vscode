package kr.co.ict.spring0102.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "안녕하세요 나의 첫 스프링 부트입니다.";
    }
}
