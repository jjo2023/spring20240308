package com.example.spring20240308.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main7")
public class Controller07 {

    // (RequestMapping) Handler Method
    @RequestMapping("sub1")
    public String method1(){
        System.out.println("Controller07.method1");
        return "view1";
    }

    @RequestMapping("sub2")
    public String method2(){
        System.out.println("Controller07.method2");
        return "html2";
    }

    // void를 return할 경우..: 요청경로가 view name이 된다. 아래와 같은 경우
    // 요청경로가 뭐야? /main7/sub3 이자나..
    // 그러니까 viwe name이 /main7/sub3이 될 것이고
    // 실제 경로는 /WEB_INF/jsp//main7/sub3.jsp
    //                      겹치는 슬러시 하나 뺘주면
    // /WEB_INF/jsp//main7sub3.jsp
    @RequestMapping("sub3")
    public void method3(){
        System.out.println("Controller07.method3");
    }

    // /WEB-INF/jsp//main7/html4.jsp
    @RequestMapping("sub4")
    public String method4(){
        return "/main7/html4";
    }

    // /main7/sub5.jsp
    @RequestMapping("sub5")
    public void method5(){


    }


}
