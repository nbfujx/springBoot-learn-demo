package com.goku.demo.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by nbfujx on 2017-12-07.
 */
@Configuration
@MapperScan(basePackages = DruidOneConfig.PACKAGE,sqlSessionFactoryRef = "SqlSessionFactoryOne")
public class DruidOneConfig {

    public static final String PACKAGE = "com.goku.demo.mapper.one";

    public static final String MAPPER_LOCATION = "classpath:mapping/one/*.xml";

    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource.druid.one")
    public DataSource dataSourceOne(){
        return DruidDataSourceBuilder.create().build();
    }

    //数据源事务管理器
    @Primary
    @Bean
    public DataSourceTransactionManager DataSourceTransactionManagerOne(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSourceOne());
        return dataSourceTransactionManager;
    }

    //创建Session
    @Primary
    @Bean
    public SqlSessionFactory SqlSessionFactoryOne() throws Exception{
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSourceOne());
        Resource[] resource = new PathMatchingResourcePatternResolver().getResources(DruidOneConfig.MAPPER_LOCATION);
        sqlSessionFactoryBean.setMapperLocations(resource);
        return sqlSessionFactoryBean.getObject();
    }
}
