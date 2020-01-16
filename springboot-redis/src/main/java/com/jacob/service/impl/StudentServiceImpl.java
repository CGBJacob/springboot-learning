package com.jacob.service.impl;

import com.jacob.service.PersonService;
import org.springframework.stereotype.Service;

@Service(value = "studentService")
public class StudentServiceImpl implements PersonService {


    @Override
    public String hello(String name) {
        return "[student service] hello " + name;
    }
}