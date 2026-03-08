package com.javawebpro.springbootweb02.dao;

import com.javawebpro.springbootweb02.pojo.Emp;

import java.util.List;

public interface EmpdDao {
    //获取员工列表数据
    public List<Emp> listEmp();
}
