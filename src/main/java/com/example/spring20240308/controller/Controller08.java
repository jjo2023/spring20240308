package com.example.spring20240308.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main8")
public class Controller08 {

    @RequestMapping("sub1")
    public void method1(Model model){
        model.addAttribute("attr1","value1");
        model.addAttribute("attr2","value2");

        // forward to /WEB-INF/jsp/main8/sub1.jsp
    }

    @RequestMapping("sub2")
    public void method2(Model model){
        model.addAttribute("propOne","😎");
        model.addAttribute("propTwo","🙄");
    }

    @RequestMapping("sub3")
    public void method3(Model model){
        // void를 리턴하니까 요청경로는 뭐겠어...
        // /main8/sub3이 되겠징?? (그 말은 곧 = view name)
        model.addAttribute("myName","jjo");
        model.addAttribute("yourAddress", List.of(5,4));
        model.addAttribute("herEmail", Map.of("a","b"));







    }
}
