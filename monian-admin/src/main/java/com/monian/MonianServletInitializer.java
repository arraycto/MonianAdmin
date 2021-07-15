package com.monian;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/15 22:12
 * web容器种进行部署
 */
public class MonianServletInitializer  extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MonianAdminApplication.class);
    }
}
