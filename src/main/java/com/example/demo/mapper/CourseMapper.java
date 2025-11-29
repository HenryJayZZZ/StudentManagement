// CourseMapper.java
package com.example.demo.mapper;

import com.example.demo.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CourseMapper {
    List<Course> findAll();
    Course findById(Integer id);
    void insert(Course course);
    void update(Course course);
    void delete(Integer id);
}
