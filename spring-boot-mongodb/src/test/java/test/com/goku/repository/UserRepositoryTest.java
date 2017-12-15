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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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
        //userRepository.deleteAll();
    }

    @Test
    public void test() throws Exception {

        // 创建10个User，并验证User总数
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
        userRepository.save(new User(4L, "didi2", 30));
        userRepository.save(new User(5L, "mama", 40));
        userRepository.save(new User(6L, "kaka2", 50));
        userRepository.save(new User(7L, "kaka", 50));
        userRepository.save(new User(8L, "kao", 50));
        userRepository.save(new User(9L, "ekakae", 50));
        userRepository.save(new User(10L, "kaka5", 50));
        userRepository.save(new User(11L, "", 50));
        userRepository.save(new User(12L, null, 50));
        this.logger.info(String.valueOf(userRepository.findAll().size()));

        // 删除一个User，再验证User总数
        /*User u = userRepository.findOne(1L);
        this.logger.info(u.toString());
        userRepository.delete(u);
        this.logger.info(String.valueOf(userRepository.findAll().size()));

        // 删除一个User，再验证User总数
        u = userRepository.findByUsername("mama").get(0);
        this.logger.info(u.toString());
        userRepository.delete(u);
        this.logger.info(String.valueOf(userRepository.findAll().size()));*/

    }

    @Test
    public void test2() throws Exception {

        // 删除一个User，再验证User总数
        List<User> u1 = userRepository.findByUsernameLike("kaka");
        this.logger.info(u1.toString());
        List<User> u2 = userRepository.findByUsername("mama");
        this.logger.info(u2.toString());
        List<User> u3 = userRepository.findByAgeGreaterThan(40);
        this.logger.info(u3.toString());
        List<User> u4 = userRepository.findByAgeLessThan(40);
        this.logger.info(u4.toString());
        List<User> u5 = userRepository.findByAgeBetween(30,45);
        this.logger.info(u5.toString());
        List<User> u6 = userRepository.findByUsernameNotNull();
        this.logger.info(u6.toString());
        List<User> u7 = userRepository.findByUsernameNull();
        this.logger.info(u7.toString());
        List<User> u8 = userRepository.findByUsernameNot("kaka");
        this.logger.info(u8.toString());




    }

    @Test
    public void test3() throws Exception {

        Pageable pageable = new PageRequest(0,10);
        Page<User> u1 = userRepository.findByNameAndAgeRange("kaka",50,pageable);
        this.logger.info(u1.toString());
        Page<User> u2 = userRepository.findByNameAndAgeRange2("kaka",0,50,pageable);
        this.logger.info(u2.toString());
        Page<User> u3 = userRepository.findByNameAndAgeRange3("kaka",0,50,pageable);
        this.logger.info(u3.toString());

    }
}
