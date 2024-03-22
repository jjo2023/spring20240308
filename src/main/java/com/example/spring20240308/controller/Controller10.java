package com.example.spring20240308.controller;

import com.example.spring20240308.domain.MyDto10;
import com.example.spring20240308.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main10")
public class Controller10 {
    @RequestMapping("/sub1")
    public void method1(Model model) {
        MyDto9 o1 = new MyDto9();
        MyDto9 o2 = new MyDto9();
        MyDto9 o3 = new MyDto9();

        o1.setFirstName("son");
        o2.setFirstName("lee");
        o3.setFirstName("park");

        model.addAttribute("students", List.of(o1, o2));

        model.addAttribute("studentList", List.of(o1, o2, o3));
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        MyDto9 o1 = new MyDto9();
        MyDto9 o2 = new MyDto9();

        o1.setLastName("두식");
        o2.setLastName("석삼");

        model.addAttribute("personMap",
                Map.of("person1", o1, "person2", o2));
        model.addAttribute("people",
                Map.of("1st", o1, "2nd", o2));
    }

    @RequestMapping("sub3")
    public void method3(Model model){
        MyDto10 o1 = new MyDto10();
        o1.setName("민정");
        o1.setId(1);
        o1.setFoods(List.of("불닭볶음면","불닭삼각김밥","불닭소세지김밥"));
        o1.setCars(List.of("벤츠","bmw","제네시스","아우디"));

        model.addAttribute("person1",o1);
    }

    @RequestMapping("sub4")
    public void method4(Model model){
        model.addAttribute("myList", List.of("tesla", "kia", "benz"));
    }
    @RequestMapping("sub5")
    public void method5(Model model){
        model.addAttribute("foodList", List.of("김밥", "pizza", "noodle", "hamburger"));
        model.addAttribute("names", List.of("쪼쪼", "쪼꼬", "춍이", "찡꼬"));
    }
    @RequestMapping("sub6")
    public void method6(Model model){

    }

    @RequestMapping("sub7")
    public void method7(Model model){
        model.addAttribute("a",3);
        model.addAttribute("b",5);
        // EL에서 연산자는 산술로만 사용된다.
        model.addAttribute("c","8");
        model.addAttribute("d","9");
    }




}













