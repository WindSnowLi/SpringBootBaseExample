package cn.hiyj.springbootbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/say") // 需要添加依赖，IDEA可推荐，选择添加就行
public class MyController {

    @ResponseBody //注明此方法返回的是字符串，不是视图，添加到类上则本类全部返回数据，不是视图
    @RequestMapping("hello") // 相对于类的路径
    public String sayHello(@RequestParam String name) {
        return "Hello!" + name;
    }

    @ResponseBody
    @RequestMapping(value = "exception")
    public String exception() throws Exception {
        throw new Exception("出现异常");
    }
}
