package cn.hiyj.springbootbase.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMyConfigService {
    @Autowired
    private MyConfigService myConfigService;

    @Test
    public void testPrintMyConfigService() {
        myConfigService.printMyConfig();
    }
}
