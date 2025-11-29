package com.example.demo.controller;

import com.example.demo.entity.SC;
import com.example.demo.service.SCService;
import com.example.demo.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scs")
public class SCController {

    private final SCService scService;

    public SCController(SCService scService){
        this.scService = scService;
    }

    @GetMapping
    public Result<List<SC>> getAll() {
        return Result.success(scService.findAll());
    }

    @GetMapping("/{id}")
    public Result<SC> getById(@PathVariable Integer id){
        SC sc = scService.findById(id);
        return sc != null ? Result.success(sc) : Result.error("选课记录不存在");
    }

    @PostMapping
    public Result<Void> add(@RequestBody SC sc){
        scService.save(sc);
        return Result.success(null, "添加成功");
    }

    @PutMapping
    public Result<Void> update(@RequestBody SC sc){
        scService.update(sc);
        return Result.success(null, "更新成功");
    }

    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Integer id){
        scService.delete(id);
        return Result.success(null, "删除成功");
    }
}
