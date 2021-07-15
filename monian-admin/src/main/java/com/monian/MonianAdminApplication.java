package com.monian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/15 22:01
 * 启动程序
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MonianAdminApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(MonianAdminApplication.class, args);
        System.out.println("  MonianAdmin启动成功  (❁´◡`❁)  \n" +
                "　◆◆◆◆◆◆　　◆　　　　　　　　　◆　　\n" +
                "　◆　　◆　◆　　◆◆　　　　　　　◆　◆　　　　　\n" +
                "　◆◆　◆◆◆　　◆　◆　　　　　◆　　　◆　　　　\n" +
                "　◆　　◆　◆　　◆　　　　　　◆　◆　　　◆　　　\n" +
                "　◆◆◆◆◆◆　◆◆◆◆　　◆◆　　　◆　　　◆◆　\n" +
                "　　　　◆　　　　◆　　　　　　◆◆◆◆◆◆　　　　\n" +
                "　◆◆◆◆◆◆　　◆　　　　　　　　　　　◆　　　　\n" +
                "　　　　◆　　　　◆　　　　　　　　　　◆　　　　　\n" +
                "　　　　◆◆◆　◆　◆　　　　　　　　◆　　　◆　　\n" +
                "　◆◆◆　　　　◆　◆　　　　◆　◆　　◆　　　◆　\n" +
                "　　◆　◆　◆　◆　◆　　　　◆　◆　　　　◆　◆　\n" +
                "　◆　◆　◆　◆　　　◆　　◆　　　◆◆◆◆◆　　　");
    }
}
