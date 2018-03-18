package test.com.goku.demo.sender.jms;

import com.goku.demo.sender.DemoApplication;
import com.goku.demo.sender.jms.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.Destination;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)//这里的Application是springboot的启动类名。
public class SpringbootJmsApplicationTests {

    @Autowired
    private Producer producer;

    @Test
    public void contextLoads() throws InterruptedException {
        Destination destination = new ActiveMQQueue("mytest2.queue");

        for(int i=0; i<100; i++){
            producer.sendMessage(destination, "myname is chhliu!!!");
        }
    }

}