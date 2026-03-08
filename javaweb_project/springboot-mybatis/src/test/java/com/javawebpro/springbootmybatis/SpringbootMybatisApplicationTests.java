package com.javawebpro.springbootmybatis;

import com.javawebpro.springbootmybatis.mapper.EmpMapper;
import com.javawebpro.springbootmybatis.mapper.UserMapper;
import com.javawebpro.springbootmybatis.pojo.Emp;
import com.javawebpro.springbootmybatis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    EmpMapper empMapper;

    @Test
    public void testDelete() {
        empMapper.delete(17);
    }

    @Test
    public void testInsert() {
        Emp emp = new Emp();
        emp.setUsername("Tom1");
        emp.setName("汤姆1");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2020,1,1));
        emp.setDeptId(1);
        emp.setCreateTime(LocalDate.now());
        emp.setUpdateTime(LocalDate.now());

        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void testUpdate() {
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("Tom11");
        emp.setName("汤姆11");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2020,1,1));
        emp.setDeptId(1);
        emp.setUpdateTime(LocalDate.now());

        empMapper.update(emp);
    }

    @Test
    public void testSelect() {
        //实体类属性名和数据库表查询返回的字段值一致，则mybatis会自动封装，否则不能自动封装
        Emp emp = empMapper.selectById(18);
        System.out.println(emp);
    }

    @Test
    public void testSelectAll() {
 //        List<Emp> lists = empMapper.selectAll("张", (short) 1, LocalDate.of(2010, 1, 1), LocalDate.of(2020, 1, 1));
        List<Emp> lists = empMapper.selectAll(null, null, null, null);
        System.out.println(lists);
    }

    @Test
    public void testUpdate2() {
        Emp emp = new Emp();
        emp.setId(19);
        emp.setUsername("Tom222");
//        emp.setName("汤姆22");
//        emp.setGender((short)2);
//        emp.setUpdateTime(LocalDate.now());

        empMapper.update2(emp);
    }

    @Test
    public void testDelete2() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 18,19);
        empMapper.deletes(list);
    }
}
