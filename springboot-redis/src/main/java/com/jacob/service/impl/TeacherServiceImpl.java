package com.jacob.service.impl;

import com.jacob.service.PersonService;
import org.springframework.stereotype.Service;

@Service(value = "teacherService")
public class TeacherServiceImpl implements PersonService {

    @Override
    public String hello(String name) {
        return "[teacher service] hello " + name;
    }
}