package cn.hiyj.springbootbase.dao.impl;

import cn.hiyj.springbootbase.config.MyConfig;
import cn.hiyj.springbootbase.dao.inter.IMyConfigDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyConfigDaoImpl implements IMyConfigDao {

    @Autowired
    private MyConfig myConfig;

    @Override
    public void printMyConfig() {
        System.out.println(myConfig.toString());
    }
}
