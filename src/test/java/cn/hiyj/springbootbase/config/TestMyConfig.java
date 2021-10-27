package cn.hiyj.springbootbase.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //SpringBoot测试类注解
public class TestMyConfig {
    @Autowired //自动注入
    private MyConfig myConfig;

    @Test
    public void testMyConfig() {
        // 如果注入失败会报空指针
        System.out.println(myConfig.toString());
    }
}
