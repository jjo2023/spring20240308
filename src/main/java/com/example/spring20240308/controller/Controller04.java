package com.example.spring20240308.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main4") // 맨 앞 / 생략 가능
public class Controller04 {

    // /main4/sub1?name=jjo
    @RequestMapping("/sub1") // 맨 앞 / 생략 가능
    // 리퀘스터 파라미터와 메소드 파라미터의 이름 같으면
    // @RequestParam의 value element 생략 가능>_< 죠타죠앙
    public void method1(@RequestParam("name") String name) {
        System.out.println("name = " + name);
    }

    // /main4/sub2?address=seoul&email=abc@gmail.com&age=44
    @RequestMapping("sub2")
    public void method2(@RequestParam String address,
                        @RequestParam String email,
                        @RequestParam Integer age) {
        System.out.println("address = " + address);
        System.out.println("email = " + email);
        System.out.println("age = " + age);
    }

    // /main4/sub3?name=jjo&married=true
    @RequestMapping("sub3")
    public void method3(String name, Boolean married) {
        System.out.println("name = " + name);
        System.out.println("married = " + married);
    }

    // /main4/sub4?check=true&email=abc@naver.com&age=55
    @RequestMapping("sub4")
    public void method4(Boolean check,
                        String email,
                        Integer age) {
        System.out.println("check = " + check);
        System.out.println("email = " + email);
        System.out.println("age = " + age);
    }


}
