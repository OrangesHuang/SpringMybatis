package com.avcdata.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 *
 * 更换druid数据源，除了在配置文件中修改type，还需要在容器中手动创建一个DruidDataSource
 * 这样在WebUI界面，才能显示具体的配置信息，以及sql语句
 *
 * Created by huangcheng on 2017/3/25.
 */
@Configuration
public class DataSourceConfig {
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
}
