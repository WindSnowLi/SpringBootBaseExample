package cn.hiyj.springbootbase.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody // 也可以取消这个返回视图
public class MyGlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String customException(Exception e) {
        return e.getMessage();
    }
}
