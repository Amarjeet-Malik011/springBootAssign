package com.ttn.springBootAssign.service;

import com.ttn.springBootAssign.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAllStudent(){
        return Arrays.asList(new Student(1,"amarjeet",10),
                new Student(2,"dolly",10),
                new Student(3,"adi",10));
    }
}
