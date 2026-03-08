package com.javawebpro.controller;

import com.javawebpro.pojo.Dept;
import com.javawebpro.pojo.Result;
import com.javawebpro.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    DeptService deptService;

    /**
     * 查询所有部门
     * @return
     */
    @GetMapping
    public Result selectAll() {
        log.info("查询所有部门");
        List<Dept> depts = deptService.selectAll();
        return Result.success(depts);
    }

    /**
     * 删除部门
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("删除部门信息" + id);
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 添加部门信息
     */
    @PostMapping
    public Result insert(@RequestBody Dept dept) {
        log.info("添加部门信息" + dept);
        deptService.insert(dept);
        return Result.success();
    }

    /**
     * 根据部门id进行查询
     */
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id) {
        log.info("根据id查询" + id);
        Dept dept = deptService.selectById(id);
        return Result.success(dept);
    }

    /**
     * 修改部门信息
     */
    @PutMapping
    public Result update(@RequestBody Dept dept) {
        log.info("修改部门信息" + dept);
        deptService.update(dept);
        return Result.success();
    }
}
