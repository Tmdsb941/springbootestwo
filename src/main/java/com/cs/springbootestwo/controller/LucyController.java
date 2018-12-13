package com.cs.springbootestwo.controller;

import com.cs.springbootestwo.pojo.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
//根ConfigurationProperties关联密切，用ConfigurationProperties获取自定义类，然后用EnableConfigurationProperties（类名.class）
// 获取用Autowired后填充到类
public class LucyController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/lucy")
    public String miya(){
        return configBean.getGreeting();
    }
}
