package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@RequestMapping("/detail")
@RestController
public class MyCotroller {

    @RequestMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Hello world");
    }

/*    @RequestMapping("/product")
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
    }


    @RequestMapping("/test1")
    public String test1(@RequestParam(defaultValue = "999") Integer id,
                        @RequestParam(required = false, name = "testname") String name){
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        return "Hello test1";
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody Student student){
        System.out.println("student's id:" + student.getId());
        System.out.println("student's name:" + student.getName());
        return "Hello test2";
    }

    @RequestMapping("/test3")
    public String test3(@RequestHeader(name = "Content-Type") String info){
        System.out.println("header info:" + info);
        return "Hello test3";
    }

    @RequestMapping("/test4/{id}/{name}")
    public String test4(@PathVariable Integer id,
                        @PathVariable String name){
        System.out.println("path id:" + id);
        System.out.println("path name:" + name);
        return "Hello test4";
    }*/
}
