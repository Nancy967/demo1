package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/detail")
@RestController
public class MyCotroller {

    @RequestMapping("/product")
    public String product(){
        return "第一個是蘋果";
    }

    @RequestMapping("/user")
    public String user(){
        return "名子是:Nancy";
    }
}
