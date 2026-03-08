package com.javawebpro.service.iml;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.javawebpro.mapper.EmpMapper;
import com.javawebpro.pojo.Emp;
import com.javawebpro.pojo.PageData;
import com.javawebpro.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceIml implements EmpService {

    @Autowired
    EmpMapper empMapper;

    /**
     * 根据页码查询数据
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageData selectAll(Integer page, Integer pageSize, String name,
                              Short gender, LocalDate begin, LocalDate end) {
//        //获取总记录数
//        Long i = empMapper.selectCount();
//        //获取列表
//        Integer start = (page - 1) * pageSize;
//        List<Emp> emps = empMapper.selectAll(start, pageSize);

        //使用pagehelper插件
        //设置分页参数
        PageHelper.startPage(page, pageSize);
        //执行查询
        List<Emp> emps = empMapper.selectAll(name, gender, begin, end);
        Page<Emp> empPage = (Page<Emp>) emps;
        //封装对象
        PageData pd = new PageData(empPage.getTotal(), empPage.getResult());
        return pd;
    }

    /**
     * 删除员工信息
     * @param ids
     */
    @Override
    public void delete(List<Integer> ids) {
        empMapper.delete(ids);
    }

    /**
     * 新增员工
     * @param emp
     */
    @Override
    public void insert(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);
    }

    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    @Override
    public Emp selectById(Integer id) {
        return empMapper.selectById(id);
    }

    /**
     * 修改员工信息
     * @param emp
     */
    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }

    /**
     * 登录
     * @param emp
     */
    @Override
    public Emp login(Emp emp) {
        return empMapper.selectByUsernameAndPassword(emp);
    }
}
