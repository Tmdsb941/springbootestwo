package com.cs.springbootestwo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiyaController {
//    调用配置文件自定属性
    @Value("${my.name}")
    private  String name;
    @Value("${my.age}")
    private  Integer age;
    @Value("${my.sclass}")
    private String sclass;


    @Value("${my.greeting}")
    private  String greeting;
    @RequestMapping(value = "/miya")
    public String miya(){
        return "姓名："+name+"\n 年龄："+age+"\n 班级："+sclass;
    }

    @RequestMapping(value = "/miyas")
    public String miyas(){
        return greeting;
    }


}
