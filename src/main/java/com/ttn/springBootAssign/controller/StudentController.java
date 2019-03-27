package com.ttn.springBootAssign.controller;

import com.ttn.springBootAssign.entity.Student;
import com.ttn.springBootAssign.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    Logger logger= LoggerFactory.getLogger(StudentController.class);
    //Ques.1
    @GetMapping("/studentList")
    public List<Student> getAllStudent(){
        logger.info("INFO : list student");
        return studentService.getAllStudent();
    }

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
}