package com.goku.demo.config;

/**
 * Created by nbfujx on 2017/10/18.
 */
public class DataSourceHolder {
    public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    /**
     * 设置数据源
     */
    public static void putDataSource(String datasource) {
        holder.set(datasource);
    }

    /**
     * 获取数据源
     */
    public static String getDataSource() {
        return holder.get();
    }


    /**
     * 清除数据源
     */
    public static void clearDataSource() {
        holder.remove();
    }
}