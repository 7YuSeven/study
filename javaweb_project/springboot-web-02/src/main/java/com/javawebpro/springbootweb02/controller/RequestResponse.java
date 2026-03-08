package com.javawebpro.springbootweb02.controller;

import com.javawebpro.springbootweb02.pojo.Address;
import com.javawebpro.springbootweb02.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestResponse {
//    @RequestMapping("/hello")
//    public String strResponse() {
//        System.out.println("Hello World");
//        return "Hello World";
//    }
//
//    @RequestMapping("/getJson")
//    public Address jsonResponse() {
//        Address address = new Address();
//        address.setProvince("江苏");
//        address.setCity("常州");
//
//        return address;
//    }
//
//    @RequestMapping("/getList")
//    public List<Address> listResponse() {
//        List<Address> list = new ArrayList<>();
//
//        Address address = new Address();
//        address.setProvince("江苏");
//        address.setCity("常州");
//
//        list.add(address);
//
//        return list;
//    }

    //统一相应结果
    @RequestMapping("/hello")
    public Result strResponse() {
        System.out.println("Hello World");
//        return new Result(1, "success", "hello world");
        return Result.success("Hello World");
    }

    @RequestMapping("/getJson")
    public Result jsonResponse() {
        Address address = new Address();
        address.setProvince("江苏");
        address.setCity("常州");

        return Result.success(address);
    }

    @RequestMapping("/getList")
    public Result listResponse() {
        List<Address> list = new ArrayList<>();

        Address address = new Address();
        address.setProvince("江苏");
        address.setCity("常州");

        list.add(address);

        return Result.success(list);
    }
}
