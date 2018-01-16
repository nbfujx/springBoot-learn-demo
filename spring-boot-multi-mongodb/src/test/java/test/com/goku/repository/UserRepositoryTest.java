package test.com.goku.repository;

import com.goku.demo.DemoApplication;
import com.goku.demo.model.User;
import com.goku.demo.repository.primary.UserRepositoryP;
import com.goku.demo.repository.secondary.UserRepositoryS;
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
    private UserRepositoryP userRepository;

    @Autowired
    private UserRepositoryS userRepository2;

    @Before
    public void setUp() {

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

    @Test
    public void test2() throws Exception {

        // 创建三个User，并验证User总数
        userRepository2.save(new User(1L, "didi22", 30));
        userRepository2.save(new User(2L, "mama22", 40));
        userRepository2.save(new User(3L, "kaka22", 50));
        this.logger.info(String.valueOf(userRepository2.findAll().size()));

        // 删除一个User，再验证User总数
        User u = userRepository2.findOne(1L);
        this.logger.info(u.toString());
        userRepository2.delete(u);
        this.logger.info(String.valueOf(userRepository2.findAll().size()));

        // 删除一个User，再验证User总数
        u = userRepository2.findByUsername("mama22");
        this.logger.info(u.toString());
        userRepository2.delete(u);
        this.logger.info(String.valueOf(userRepository2.findAll().size()));

    }
}
