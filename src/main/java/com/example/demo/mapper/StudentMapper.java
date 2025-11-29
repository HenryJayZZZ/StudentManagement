// StudentMapper.java
package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> findAll();
    Student findById(Integer id);
    void insert(Student student);
    void update(Student student);
    void delete(Integer id);
}
