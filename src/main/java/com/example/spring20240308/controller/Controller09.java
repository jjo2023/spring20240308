package com.example.spring20240308.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main9")
public class Controller09 {
    @RequestMapping("sub1")
    public void method1(Model model){
        model.addAttribute("attr1","jjo");
        model.addAttribute("attr2",300);
        model.addAttribute("attr3",true);
        model.addAttribute("attr4",3.14);

        // 모델 속성이 배열일 경우
        model.addAttribute("attr5",new String[]{"lee", "kim"});

        String[] myArr1={"Korea", "seoul", "jeju"};
        model.addAttribute("yourArr6", myArr1);
    }

    @RequestMapping("sub2")
    public void method2(Model model){
        // 모델 속성이 배열인 경우...를 생각해보자..
        // 방법1.
        String[] myName={"kim", "lee", "jjo"};
        model.addAttribute("myName",myName);

        // 방법2. value에 직접 담기..?
        model.addAttribute("yourEmail",new String[]{"123@com","ert@com","33@com"});

        String[] herAddress={"서울","런던","파리"};
        model.addAttribute("herAddress",herAddress);
    }


}
