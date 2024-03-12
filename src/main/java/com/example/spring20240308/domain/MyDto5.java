package com.example.spring20240308.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor // 파이널이던 아니던 상관없이 모든 생성자 받음
public class MyDto5 {
    private  String name;
    private  Integer age;
}
