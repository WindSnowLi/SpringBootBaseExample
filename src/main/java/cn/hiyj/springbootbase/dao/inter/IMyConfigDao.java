package cn.hiyj.springbootbase.dao.inter;

import org.springframework.stereotype.Repository;


@Repository(value="myConfigDao")
public interface IMyConfigDao {
    void printMyConfig();
}
