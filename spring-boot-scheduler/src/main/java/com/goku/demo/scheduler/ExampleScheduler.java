package com.goku.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by nbfujx on 2017/12/6.
 */
@Component
public class ExampleScheduler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "*/5 * * * * * ")
    public void loginfo() {
       this.logger.info("this is one");
    }

    @Scheduled(fixedRate = 5000)
    public void loginfo2() {
        this.logger.info("this is two");
    }

    @Scheduled(fixedDelay = 5000)
    public void loginfo3() {
        this.logger.info("this is three");
    }
}
