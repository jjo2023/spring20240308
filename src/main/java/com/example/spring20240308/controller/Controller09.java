package com.example.spring20240308.controller;

import com.example.spring20240308.domain.MyDto7;
import com.example.spring20240308.domain.MyDto8;
import com.example.spring20240308.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Controller
@RequestMapping("main9")
public class Controller09 {
    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("attr1", "jjo");
        model.addAttribute("attr2", 300);
        model.addAttribute("attr3", true);
        model.addAttribute("attr4", 3.14);

        // 모델 속성이 배열일 경우
        model.addAttribute("attr5", new String[]{"lee", "kim"});

        String[] myArr1 = {"Korea", "seoul", "jeju"};
        model.addAttribute("yourArr6", myArr1);
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        // 모델 속성이 배열인 경우...를 생각해보자..
        // 방법1.
        String[] myName = {"kim", "lee", "jjo"};
        model.addAttribute("myName", myName);

        // 방법2. value에 직접 담기..?
        model.addAttribute("yourEmail", new String[]{"123@com", "ert@com", "33@com"});

        String[] herAddress = {"서울", "런던", "파리"};
        model.addAttribute("herAddress", herAddress);
    }

    @RequestMapping("sub3")
    public void method3(Model model) {
        // 모델의 속성이 리스트인 경우
        model.addAttribute("names", List.of("두식", "석삼", "너구리"));

        var list1 = List.of("무빙","엘리멘탈");
        model.addAttribute("list1",list1);

        var list2 = List.of("korea", "us", "japan");
        model.addAttribute("mapList1",list2);

        var list3 = List.of("london", "paris", "jeju","newyork");
        model.addAttribute("cities",list3);
    }

    @RequestMapping("sub4")
    public void method4(Model model){
        var map1 = Map.of("son",1,"lee",19,"kim",30);
        model.addAttribute("myMap",map1);

        model.addAttribute("cityMap",Map.of("seoul","경복궁","busan","해운대"));

        var map2 = Map.of("red","빨강","blue","파랑","black","검정");
        model.addAttribute("color",map2);

        var map3= Map.of(
                "name", "두식",
                "my name", "석삼",
                "your-name", "너구리"

        );
        model.addAttribute("attr3",map3);
    }

    @RequestMapping("sub5")
    public void method5(Model model){
        var map1 = Map.of("phone1","iphone", "phone2","galaxy");
        var map2 = Map.of("korea","seoul","us","ny");
        var map3 = Map.of("1st", "hamburger", "2st", "pizza");

        model.addAttribute("phones",map1);
        model.addAttribute("caps",map2);
        model.addAttribute("foods",map3);
    }
    @RequestMapping("sub6")
    public void method6(Model model){
        model.addAttribute("attr1", new Object());
        model.addAttribute("attr2", new Scanner(System.in));
        model.addAttribute("attr3", new MyDto7());
    }
    @RequestMapping("sub7")
    public void method7(Model model){
        MyDto8 o1 = new MyDto8();
        o1.setFood("pizza");
        o1.setComputer("intel");
        o1.setBirthDate("2020-01-01");

        model.addAttribute("person1",o1);
    }
    @RequestMapping("sub8")
    public void method8(Model model){
        MyDto9 obj = new MyDto9();
        obj.setId(1);
        obj.setFirstName("minjung");
        obj.setLastName("kim");
        obj.setClassName("고양이반");
        obj.setPhoneNumber(0101111);
        model.addAttribute("student",obj);
    }







}

