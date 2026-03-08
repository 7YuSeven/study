package com.javawebpro.exception;

import com.javawebpro.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 捕获所有异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        e.printStackTrace();
        return Result.error("对不起，操作失败，请联系管理员");
    }
}
