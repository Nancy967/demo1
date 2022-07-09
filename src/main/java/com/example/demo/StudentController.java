package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @PostMapping("/students")
//    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public String create(@RequestBody Student student){
        return "資料庫 create";
    }

    @GetMapping("/students/{studentId}")
    public String read(@PathVariable Integer studentId){
        return "資料庫 read";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student){
        return "資料庫 update";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId){
        return "資料庫 delete";
    }
}
