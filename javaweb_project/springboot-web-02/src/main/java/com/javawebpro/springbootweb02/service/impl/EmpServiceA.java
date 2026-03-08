package com.javawebpro.springbootweb02.service.impl;

import com.javawebpro.springbootweb02.dao.EmpdDao;
import com.javawebpro.springbootweb02.dao.impl.EmpDaoA;
import com.javawebpro.springbootweb02.pojo.Emp;
import com.javawebpro.springbootweb02.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

@Service//将当前类交给IOC容器管理，成为IOC容器中的bean
public class EmpServiceA implements EmpService {
    @Autowired//运行时，IOC容器会提供该类型的bean对象，并赋值给该类型的变量--依赖注入
    EmpdDao empdDao;

    @Override
    public List<Emp> listEmp() {
        //调用
        List<Emp> list = empdDao.listEmp();
        //2.对数据进行转换处理
        list.stream().forEach(new Consumer<Emp>() {
            @Override
            public void accept(Emp emp) {
                //处理gender，1为男，2为女
                String gender = emp.getGender();
                if ("1".equals(gender)){
                    emp.setGender("男");
                } else if ("2".equals(gender)) {
                    emp.setGender("女");
                }
                //处理job，1为讲师，2为班主任，3为就业指导
                String job = emp.getJob();
                if ("1".equals(job)) {
                    emp.setJob("讲师");
                } else if ("2".equals(job)) {
                    emp.setJob("班主任");
                } else if ("3".equals(job)) {
                    emp.setJob("就业指导");
                }
            }
        });

        return list;
    }
}
