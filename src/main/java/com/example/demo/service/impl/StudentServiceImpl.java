package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public void save(Student student) {
        if (studentMapper.findById(student.getId()) != null) {
            return;
        }
        studentMapper.insert(student);
    }

    @Override
    public void update(Student student) {
        if (studentMapper.findById(student.getId()) == null) {
            return;
        }
        studentMapper.update(student);
    }

    @Override
    public void delete(Integer id) {
        if (studentMapper.findById(id) == null) {
            return;
        }
        studentMapper.delete(id);
    }
}
