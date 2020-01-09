package com.example.demo.controller;

import com.example.demo.FormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "demo")
public class DemoController {
    @Autowired
    private FormatTemplate formatTemplate;

    @RequestMapping(value = "helloWorld")
    public String helloWorld(){
        User user=new User();
        user.setAge(26);
        user.setName("demo");
        return formatTemplate.doFormat(user);
    }
}