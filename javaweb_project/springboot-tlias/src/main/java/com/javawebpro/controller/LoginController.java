package com.javawebpro.controller;

import com.javawebpro.pojo.Emp;
import com.javawebpro.pojo.Result;
import com.javawebpro.service.EmpService;
import com.javawebpro.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    private EmpService empService;

    /**
     * 登录
     * @param emp
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("接收到的数据为" + emp);
        Emp e = empService.login(emp);
        //登录成功，下发JWT令牌
        if(e != null){
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", e.getId());
            claims.put("username", e.getUsername());
            claims.put("password", e.getPassword());
            String jwt = JwtUtils.generateJwt(claims);

            return Result.success(jwt);
        }

        return Result.error("用户名或密码错误");
    }

}
