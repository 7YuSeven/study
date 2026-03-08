package com.javawebpro.interceptor;


import com.alibaba.fastjson.JSONObject;
import com.javawebpro.pojo.Result;
import com.javawebpro.utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor {
    //目标资源方法运行前运行，true放行，false不放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");

        //获取url路径
        String uri = request.getRequestURI();
        log.info("获取的url：" + uri);

        //判断url中是否包含login页面
        if (uri.contains("login")) {
            log.info("放行....");
            return true;
        }

        //获取token令牌
        String jwt = request.getHeader("token");

        //判断令牌是否存在, 不存在则返回错误信息
        if (!StringUtils.hasLength(jwt)) {
            log.info("请求头token为空");
            Result error = Result.error("NOT_LOGIN");
            //转换为json对象
            String jsonString = JSONObject.toJSONString(error);
            response.getWriter().write(jsonString);
            return false;
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
            response.getWriter().write(jsonString);
            return false;
        }

        //放行
        log.info("令牌合法，放行");
        return true;
    }

    //目标资源运行后运行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    //视图资源渲染完毕后运行，最后运行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
