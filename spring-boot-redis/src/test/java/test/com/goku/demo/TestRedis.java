package test.com.goku.demo;

import com.goku.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.com.goku.demo.model.User;

import java.io.Serializable;

/**
 * Created by nbfujx on 2017-12-07.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TestRedis implements Serializable{

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() throws Exception {
        // 保存字符串
        //redisTemplate.opsForValue().set("DA22222", "111");
        this.logger.info((String) redisTemplate.opsForValue().get("2222222222222"));
    }

    @Test
    public void testobject() throws Exception {
        User user = new User("用户1", 20);
        redisTemplate.opsForValue().set("用户1",user);
        // 保存对象
        User user2= (User) redisTemplate.opsForValue().get("用户1");
        this.logger.info(String.valueOf(user2.getAge()));
    }


}
