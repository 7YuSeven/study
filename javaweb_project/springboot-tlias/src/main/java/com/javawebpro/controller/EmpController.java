package com.javawebpro.controller;

import com.javawebpro.pojo.Emp;
import com.javawebpro.pojo.PageData;
import com.javawebpro.pojo.Result;
import com.javawebpro.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    EmpService empService;

    /**
     * 分页查询所有员工信息
     * @RequestParam设置默认参数
     */
    @GetMapping
    public Result selectAll(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer pageSize,
                            String name,
                            Short gender,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        log.info("查询所有员工信息, 具体为" + page + "," + pageSize + "," + name + "," +
                gender + "," + begin + "," + end);
        PageData pageData = empService.selectAll(page, pageSize, name, gender, begin, end);
        return Result.success(pageData);
    }

    /**
     * 删除员工信息
     * @param ids
     * @return
     */
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids) {
        log.info("批量删除" + ids);
        empService.delete(ids);
        return Result.success();
    }

    /**
     * 新增员工信息
     * @param emp
     * @return
     */
    @PostMapping
    public Result insert(@RequestBody Emp emp) {
        log.info("员工信息为" + emp);
        empService.insert(emp);
        return Result.success();
    }

    /**
     * 根据id查询某个员工信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id) {
        log.info("查询的id为" + id);
        Emp emp = empService.selectById(id);
        return Result.success(emp);
    }

    /**
     * 修改员工信息
     * @param emp
     * @return
     */
    @PutMapping
    public Result update(@RequestBody Emp emp) {
        log.info("修改的员工信息为" + emp);
        empService.update(emp);
        return Result.success();
    }
}
