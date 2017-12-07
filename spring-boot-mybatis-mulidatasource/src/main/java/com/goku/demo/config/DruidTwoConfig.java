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
@MapperScan(basePackages = DruidTwoConfig.PACKAGE,sqlSessionFactoryRef = "SqlSessionFactoryTwo")
public class DruidTwoConfig {

    public static final String PACKAGE = "com.goku.demo.mapper.two";

    public static final String MAPPER_LOCATION = "classpath:mapping/two/*.xml";

    @Bean
    @ConfigurationProperties("spring.datasource.druid.two")
    public DataSource dataSourceTwo(){
        return DruidDataSourceBuilder.create().build();
    }

    //数据源事务管理器
    @Bean
    public DataSourceTransactionManager DataSourceTransactionManagerTwo(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSourceTwo());
        return dataSourceTransactionManager;
    }

    //创建Session
    @Bean
    public SqlSessionFactory SqlSessionFactoryTwo() throws Exception{
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSourceTwo());
        Resource[] resource = new PathMatchingResourcePatternResolver().getResources(DruidTwoConfig.MAPPER_LOCATION);
        sqlSessionFactoryBean.setMapperLocations(resource);
        return sqlSessionFactoryBean.getObject();
    }

}
