package com.example.spring20240308.controller;

import com.example.spring20240308.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main10")
public class Controller10 {
    @RequestMapping("sub1")
    public void method1(Model model) {

        MyDto9 o1 = new MyDto9();
        MyDto9 o2 = new MyDto9();

        o1.setFirstName("son");
        o2.setFirstName("lee");

        MyDto9 obj1 = new MyDto9();
        obj1.setFirstName("첫번째이름이올시다");

        MyDto9 obj2 = new MyDto9();
        obj2.setFirstName("두번째이올시다");

        MyDto9 obj3 = new MyDto9();
        obj3.setFirstName("세번째!!!!");

        model.addAttribute("students", List.of(o1, o2));
        model.addAttribute("studentList", List.of(obj1, obj2, obj3));
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        MyDto9 o1 = new MyDto9();
        MyDto9 o2 = new MyDto9();

        o1.setLastName("두식이");
        o2.setLastName("석삼");

        model.addAttribute("personMap", Map.of("person1", o1, "person2", o2));

        model.addAttribute("people",Map.of("1st",o1,"2nd",o2));


    }
}













