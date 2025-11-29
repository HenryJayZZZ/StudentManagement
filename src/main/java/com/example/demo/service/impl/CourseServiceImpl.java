package com.example.demo.service.impl;

import com.example.demo.entity.Course;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }
    @Override
    public Course findById(Integer id) {
        return courseMapper.findById(id);
    }

    @Override
    public void save(Course course) {
        if (courseMapper.findById(course.getId()) != null) {
            // 课程已存在，不插入
            return;
        }
        courseMapper.insert(course);
    }

    @Override
    public void update(Course course) {
        if (courseMapper.findById(course.getId()) == null) {
            // 课程不存在，不更新
            return;
        }
        courseMapper.update(course);
    }

    @Override
    public void delete(Integer id) {
        if (courseMapper.findById(id) == null) {
            // 课程不存在，不删除
            return;
        }
        courseMapper.delete(id);
    }
}
