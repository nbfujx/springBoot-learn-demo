package test.com.goku.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.goku.demo.DemoApplication;
import com.goku.demo.entity.User;
import com.goku.demo.repository.UserExtRepository;
import com.goku.demo.service.UserService;
import com.goku.demo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by nbfujx on 2017-12-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserServiceImplTest {


    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;

    @Autowired
    UserExtRepository userExtRepository;

    @Test
    public void getUserList() throws Exception {
      this.logger.info(JSON.toJSONString(userService.getUserList()));
    }

    @Test
    public void getUserInfo() throws Exception {
        this.logger.info(JSON.toJSONString(userExtRepository.getUserInfo("1")));
    }

    @Test
    public void findUserById() throws Exception {
        this.logger.info(JSON.toJSONString(userService.findUserById("test")));
    }

    @Test
    public void save() throws Exception {
        User u=new  User();
        u.setId("1111");
        u.setEmailAddress("2222");
        u.setCompanyId("3333");
        u.setNickName("44444");
        u.setPassword("55555");
        userService.save(u);
    }

    @Test
    public void edit() throws Exception {
        User u=userService.findUserById("test2");
        u.setCompanyId("2222");
        userService.edit(u);
    }

    @Test
    public void delete() throws Exception {
        userService.delete("test");
    }

}