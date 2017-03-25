package com.avcdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by huangcheng on 2017/3/24.
 */
@SpringBootApplication
/**
 *  开启Servlet扫描，为了让web可以访问druid的监测页面
 *  配置类在com.avcdata.filter下
 *  通过DruidStatViewServlet配置登录的账号密码
 */
@ServletComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
