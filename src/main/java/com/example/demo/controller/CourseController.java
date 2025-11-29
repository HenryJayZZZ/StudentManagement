package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import com.example.demo.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping
    public Result<List<Course>> getAll() {
        return Result.success(courseService.findAll());
    }

    @GetMapping("/{id}")
    public Result<Course> getById(@PathVariable Integer id){
        Course course = courseService.findById(id);
        return course != null ? Result.success(course) : Result.error("课程不存在");
    }

    @PostMapping
    public Result<Void> add(@RequestBody Course course){
        courseService.save(course);
        return Result.success(null, "添加成功");
    }

    @PutMapping
    public Result<Void> update(@RequestBody Course course){
        courseService.update(course);
        return Result.success(null, "更新成功");
    }

    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Integer id){
        courseService.delete(id);
        return Result.success(null, "删除成功");
    }
}
