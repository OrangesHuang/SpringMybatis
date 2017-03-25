package com.avcdata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huangcheng on 2017/3/25.
 */
@Configuration
//  使用tk的办法，让Mybatis不再需要打@Mapper注解在我们的Java's Mapper上
@MapperScan(value = "MapperScannerConfigurer", basePackages = "com.avcdata.dao")
public class MyBatisConfig {
}
