package com.javawebpro.springbootweb02.dao.impl;

import com.javawebpro.springbootweb02.dao.EmpdDao;
import com.javawebpro.springbootweb02.pojo.Emp;
import com.javawebpro.springbootweb02.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//(value = "daoA")可以指定bean的名字//将当前类交给IOC容器管理，成为IOC容器中的bean
public class EmpDaoA implements EmpdDao {

    @Override
    public List<Emp> listEmp() {
        //1.加载并解析xml文件
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        List<Emp> list = XmlParserUtils.parse(file, Emp.class);

        return list;
    }
}
