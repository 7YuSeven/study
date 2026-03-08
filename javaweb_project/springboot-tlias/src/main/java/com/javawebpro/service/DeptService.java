package com.javawebpro.service;


import com.javawebpro.pojo.Dept;
import com.javawebpro.pojo.Result;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门
     * @return
     */
    List<Dept> selectAll();

    /**
     * 删除部门信息
     */
    void delete(Integer id);

    /**
     *新增部门信息
     * @param dept
     */
    void insert(Dept dept);

    /**
     * 修改部门信息
     * @param dept
     */
    void update(Dept dept);

    /**
     * 根据id查询部门信息
     * @param id
     * @return
     */
    Dept selectById(Integer id);
}
