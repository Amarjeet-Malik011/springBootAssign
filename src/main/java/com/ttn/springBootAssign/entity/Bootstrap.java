package com.ttn.springBootAssign.entity;

import com.ttn.springBootAssign.controller.DatabaseController;
import com.ttn.springBootAssign.repository.StudentRepository;
import com.ttn.springBootAssign.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrap {
    // Q6...Bootstrap Data for Student Domain
    @Autowired
    StudentRepository studentRepository;
    Logger logger= LoggerFactory.getLogger(Bootstrap.class);

    @EventListener(ApplicationStartedEvent.class)
    public void init()
    {
        logger.info("bootstraping data");
        Iterator<Student> bookIterable = studentRepository.findAll().iterator();
        if (!bookIterable.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i, "Book " + i,10.0f);
                studentRepository.save(student);
                System.out.println("Student " + i + " created");
            }
        }
        System.out.println("Your Application is up and running");
    }
}
