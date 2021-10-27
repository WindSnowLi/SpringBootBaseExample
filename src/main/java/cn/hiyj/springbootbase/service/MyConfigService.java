package cn.hiyj.springbootbase.service;

import cn.hiyj.springbootbase.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myConfigService")
public class MyConfigService {
    @Autowired
    private MyConfig myConfig;

    public void printMyConfig() {
        System.out.println(myConfig.toString());
    }
}
