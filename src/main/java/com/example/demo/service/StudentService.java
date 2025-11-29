// StudentService.java
package com.example.demo.service;

import com.example.demo.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Integer id);
    void save(Student student);
    void update(Student student);
    void delete(Integer id);
}
