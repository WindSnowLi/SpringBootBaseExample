package cn.hiyj.springbootbase.config;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration // 添加配置类注解，将此类交给SpringBoot进行管理
public class MyConfig {
    private int pid = 110;
    private String password = "5201314";

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
                "pid=" + pid +
                ", password='" + password + '\'' +
                '}';
    }
}
