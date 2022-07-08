package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RequestMapping("/detail")
@RestController
public class MyCotroller {
/*
    @RequestMapping("/product")
    public Store product(){
        Store store = new Store();
        List<String> storeList = new ArrayList<>();
        storeList.add("蘋果");
        storeList.add("橘子");
        store.setProductList(storeList);
        return store;
    }

    @RequestMapping("/user")
    public Student user(){
        Student student = new Student();
        student.setName("Nancy");
        return student;
    }*/

    @RequestMapping("/test1")
    public String test1(@RequestParam(defaultValue = "999") Integer id,
                        @RequestParam(required = false, name = "testname") String name){
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        return "Hello test1";
    }
}
