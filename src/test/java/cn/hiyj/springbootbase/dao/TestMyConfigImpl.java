package cn.hiyj.springbootbase.dao;

import cn.hiyj.springbootbase.dao.inter.IMyConfigDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMyConfigImpl {

    @Autowired
    private IMyConfigDao myConfigDao;

    @Test
    public void testPrintMyConfig(){
        myConfigDao.printMyConfig();
    }
}
