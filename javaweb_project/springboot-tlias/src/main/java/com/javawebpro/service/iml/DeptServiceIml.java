package com.javawebpro.service.iml;

import com.javawebpro.mapper.DeptMapper;
import com.javawebpro.pojo.Dept;
import com.javawebpro.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceIml implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    /**
     * 查询所有部门
     * @return
     */
    @Override
    public List<Dept> selectAll() {
        return deptMapper.selectAll();
    }

    /**
     * 删除部门信息
     */
    @Override
    public void delete(Integer id) {
        deptMapper.delete(id);
    }

    /**
     * 新增部门信息
     * @param dept
     */
    @Override
    public void insert(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }

    /**
     * 修改部门信息
     * @param dept
     */
    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }

    /**
     * 根据id查询部门信息
     * @param id
     * @return
     */
    @Override
    public Dept selectById(Integer id) {
        return deptMapper.selectById(id);
    }
}
