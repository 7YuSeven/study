package com.javawebpro.springbootweb02.controller;

import com.javawebpro.springbootweb02.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {
    //原始方式
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        //获取请求参数
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//        int age = Integer.parseInt(ageStr);
//
//        System.out.println(name + ":" + age);
//
//        return "ok";
//    }

    //SpringBoot方式
    @RequestMapping("/simpleParam")
    //参数变量名要和请求参数一致，如果不一致会接收到null，
    // 可以使用@RequestParam注解来指定，其中的required参数表示参数是否必须，true则表示请求参数必须传递
    public String simpleParam(@RequestParam(name = "name", required = true) String username, Integer age){
        System.out.println(username + ":" + age);
        return "OK";
    }

    //简单实体参数
    //请求参数的名称与对象中的属性名称相同
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }

    //复杂实体参数
    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "OK";
    }

    //数组参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    //集合参数
    //请求参数有多个，需要注解@RequestParam来邦迪参数
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "OK";
    }

    //日期参数
    //注意使用@DateTimeFormat注解来指定日期格式
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return "OK";
    }

    //JSON参数
    //JSON数据的键名要与对象参数的属性名一致，并且使用@RequestBody注解
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    //路径参数（指的是参数成为了url的一部分）
    //通过请求url直接传递参数，使用{...}来标识该参数，需要使用@PathVariable获取路径参数
    @RequestMapping("/pathParam/{id}")
    public String pathParam1(@PathVariable Integer id){
        System.out.println(id);
        return "OK";
    }

    //多个路径参数
    @RequestMapping("pathParam/{id}/{name}")
    public String pathParam2(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id + ":" + name);
        return "OK";
    }
}
