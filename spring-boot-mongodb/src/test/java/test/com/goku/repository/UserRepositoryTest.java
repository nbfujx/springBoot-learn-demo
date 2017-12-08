package test.com.goku.repository;

import com.goku.demo.DemoApplication;
import com.goku.demo.model.User;
import com.goku.demo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nbfujx on 2017-12-08.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserRepositoryTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() {
        userRepository.deleteAll();
    }

    @Test
    public void test() throws Exception {

        // 创建三个User，并验证User总数
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
        this.logger.info(String.valueOf(userRepository.findAll().size()));

        // 删除一个User，再验证User总数
        User u = userRepository.findOne(1L);
        this.logger.info(u.toString());
        userRepository.delete(u);
        this.logger.info(String.valueOf(userRepository.findAll().size()));

        // 删除一个User，再验证User总数
        u = userRepository.findByUsername("mama");
        this.logger.info(u.toString());
        userRepository.delete(u);
        this.logger.info(String.valueOf(userRepository.findAll().size()));

    }
}
