package com.example.demo.controller;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public Result<List<Student>> getAll() {
        return Result.success(studentService.findAll());
    }

    @GetMapping("/{id}")
    public Result<Student> getById(@PathVariable Integer id){
        Student student = studentService.findById(id);
        return student != null ? Result.success(student) : Result.error("学生不存在");
    }

    @PostMapping
    public Result<Void> add(@RequestBody Student student){
        studentService.save(student);
        return Result.success(null, "添加成功");
    }

    @PutMapping
    public Result<Void> update(@RequestBody Student student){
        studentService.update(student);
        return Result.success(null, "更新成功");
    }

    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Integer id){
        studentService.delete(id);
        return Result.success(null, "删除成功");
    }
}
