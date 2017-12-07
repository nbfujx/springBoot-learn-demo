package com.goku.demo.config;

import com.goku.demo.config.DataSourceHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by nbfujx on 2017/10/18.
 */
public class DynamicDataSource extends AbstractRoutingDataSource  {


    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSource();
    }

}