package com.javawebpro.filter;

import com.alibaba.fastjson.JSONObject;
import com.javawebpro.pojo.Result;
import com.javawebpro.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.IOException;

@Slf4j
//@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        //获取url路径
        String uri = req.getRequestURI();
        log.info("获取的url：" + uri);

        //判断url中是否包含login页面
        if (uri.contains("login")) {
            log.info("放行....");
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        //获取token令牌
        String jwt = req.getHeader("token");

        //判断令牌是否存在, 不存在则返回错误信息
        if (!StringUtils.hasLength(jwt)) {
            log.info("请求头token为空");
            Result error = Result.error("NOT_LOGIN");
            //转换为json对象
            String jsonString = JSONObject.toJSONString(error);
            resp.getWriter().write(jsonString);
            return;
        }

        //解析token令牌,如果失败则返回
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("解析错误，登录失败");
            Result error = Result.error("NOT_LOGIN");
            //转换为json对象
            String jsonString = JSONObject.toJSONString(error);
            resp.getWriter().write(jsonString);
            return;
        }

        //放行
        log.info("令牌合法，放行");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
