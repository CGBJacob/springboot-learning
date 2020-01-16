package com.jacob.controller;

import com.jacob.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private PersonService studentService;

    @Autowired
    private PersonService teacherService;

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name) {
        return studentService.hello(name) + "=======>" + teacherService.hello(name);
    }
}