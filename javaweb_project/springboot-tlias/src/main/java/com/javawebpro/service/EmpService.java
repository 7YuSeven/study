package com.javawebpro.service;

import com.javawebpro.pojo.Emp;
import com.javawebpro.pojo.PageData;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
    /**
     * 分页查询员工信息
     * @param page
     * @param pageSize
     * @return
     */
    PageData selectAll(Integer page, Integer pageSize, String name,
                       Short gender, LocalDate begin, LocalDate end);

    /**
     * 删除员工信息
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 新增员工
     * @param emp
     */
    void insert(Emp emp);

    /**
     * 查询某个员工的信息
     * @param id
     * @return
     */
    Emp selectById(Integer id);

    /**
     * 修改员工信息
     * @param emp
     */
    void update(Emp emp);

    /**
     * 登录
     * @param emp
     */
    Emp login(Emp emp);
}
