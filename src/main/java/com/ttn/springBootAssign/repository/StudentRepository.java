package com.ttn.springBootAssign.repository;

import com.ttn.springBootAssign.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
    Iterable<Student> findAll();
}
