package com.example.spring20240308.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main1") // 맨 앞에 슬러시 생략 가능
public class Controller02 {
    @RequestMapping("/sub1")// 같은 경로는 클래스 레벨로 뺄수 있다..
    public void method1() {
        System.out.println("Controller02.method1");
    }

    // /main1/sub2 메소드 작성
    @RequestMapping("sub2")  // 맨 앞에 슬러시 생략 가능
    public void method2(){
        System.out.println("Controller02.method2 냐냐냐");
    }

    // /main/sub3 요청에 일하는 method3() 작성
    @RequestMapping("sub3")
    public void method3(){
        System.out.println("메소드3 실행");
    }



}
