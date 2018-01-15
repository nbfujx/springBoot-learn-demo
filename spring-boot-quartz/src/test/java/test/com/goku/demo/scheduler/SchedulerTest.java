package test.com.goku.demo.scheduler;

import com.goku.demo.DemoApplication;
import com.goku.demo.job.HelloJob;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

/**
 * Created by nbfujx on 2018-01-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class SchedulerTest {

    //加入Qulifier注解，通过名称注入bean
    @Autowired
    @Qualifier("Scheduler")
    private Scheduler scheduler;

    @Test
    public void addjob() throws Exception {
        // 启动调度器
        scheduler.start();
        JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity("HelloJob", "group1").build();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("HelloJob", "group1").startNow().withSchedule(simpleSchedule()
                .withIntervalInSeconds(10)
                .repeatForever()).build();
        scheduler.scheduleJob(job, trigger);
    }



    @Test
    public void pausejob() throws Exception {
        scheduler.pauseJob(JobKey.jobKey("HelloJob", "group1"));
    }

    @Test
    public void resumejob() throws Exception {
        scheduler.resumeJob(JobKey.jobKey("HelloJob", "group1"));
    }

    @Test
    public void deletejob() throws Exception {
        scheduler.pauseTrigger(TriggerKey.triggerKey("HelloJob", "group1"));
        scheduler.unscheduleJob(TriggerKey.triggerKey("HelloJob", "group1"));
        scheduler.deleteJob(JobKey.jobKey("HelloJob", "group1"));
    }

    @Test
    public void queryjob() throws Exception {

    }

}
