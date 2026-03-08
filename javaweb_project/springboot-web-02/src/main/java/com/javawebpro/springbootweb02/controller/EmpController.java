package com.javawebpro.springbootweb02.controller;

import com.javawebpro.springbootweb02.pojo.Emp;
import com.javawebpro.springbootweb02.pojo.Result;
import com.javawebpro.springbootweb02.service.EmpService;
import com.javawebpro.springbootweb02.service.impl.EmpServiceA;
import com.javawebpro.springbootweb02.utils.XmlParserUtils;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;

@RestController
public class EmpController {

//    @Qualifier(value = "empServiceA")//设置注入的bean类，value可省略（指的是要注入的bean类名）
//    @Autowired//运行时，IOC容器会提供该类型的bean对象，并赋值给该类型的变量--依赖注入(默认按照类型进行注入)
//    EmpService empService;
    @Resource(name = "empServiceB")//jdk提供，设置要注入类的名称，按照名称注入
    EmpService empService;

    @RequestMapping("/listEmp")
    public Result list(){
        //调用service包，获取逻辑处理后的数据
        List<Emp> list = empService.listEmp();
        //3.响应数据
        return Result.success(list);
    }

//    @RequestMapping("/listEmp")
//    public Result list(){
//        //1.加载并解析xml文件
//        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        List<Emp> list = XmlParserUtils.parse(file, Emp.class);
//
//        //2.对数据进行转换处理
//        list.stream().forEach(new Consumer<Emp>() {
//            @Override
//            public void accept(Emp emp) {
//                //处理gender，1为男，2为女
//                String gender = emp.getGender();
//                if ("1".equals(gender)){
//                    emp.setGender("男");
//                } else if ("2".equals(gender)) {
//                    emp.setGender("女");
//                }
//                //处理job，1为讲师，2为班主任，3为就业指导
//                String job = emp.getJob();
//                if ("1".equals(job)) {
//                    emp.setJob("讲师");
//                } else if ("2".equals(job)) {
//                    emp.setJob("班主任");
//                } else if ("3".equals(job)) {
//                    emp.setJob("就业指导");
//                }
//            }
//        });
//
//        //3.响应数据
//        return Result.success(list);
//    }
}
