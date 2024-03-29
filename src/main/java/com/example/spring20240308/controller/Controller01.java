package com.example.spring20240308.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controller01 {

    @RequestMapping("/")
    public void method1(){
        System.out.println("Controller01.method1");
    }

    @RequestMapping("/path1")
    public void method2(){
        System.out.println("Controller01.method2");
    }

    // path2로 요청 왔을 때 일하는 메소드 작성
    @RequestMapping("/path2")
    public void method3(){
        System.out.println("메소드3실행!");
    }

    @RequestMapping("path5") // 맨 앞에 슬러시 생략 가능
    public void method5(){
        System.out.println("Controller01.method5");
    }

}
