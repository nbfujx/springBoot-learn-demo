package com.goku.demo.config;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *  Created by nbfujx on 2017/10/18.
 */
@Aspect
@Order(-99) // 控制多个Aspect的执行顺序，越小越先执行
@Component
public class DataSourceAspect {

    private Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);

    /**
     * 在dao层方法之前获取datasource对象之前在切面中获取数据源
     */
    @Before("execution(* com.goku.demo.service..*.*(..))")
    public void before(JoinPoint point)
    {
        Object target = point.getTarget();
        this.logger.info(target.toString());
        String method = point.getSignature().getName();
        Class<?>[] classz = target.getClass().getInterfaces();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
                .getMethod().getParameterTypes();
        try {
            Method m = classz[0].getMethod(method, parameterTypes);
            this.logger.info("method："+ m.getName());
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource data = m.getAnnotation(DataSource.class);
                DataSourceHolder.putDataSource(data.value());
                this.logger.info("dataSource："+DataSourceHolder.getDataSource());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
