package test.com.goku.demo.service.impl;

import com.goku.demo.DemoApplication;
import com.goku.demo.config.DataSourceAspect;
import com.goku.demo.model.UserWithBLOBs;
import com.goku.demo.service.UserService;
import com.goku.demo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nbfujx on 2017/12/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserServiceImplTest  {

    private Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);

    @Autowired
    @Qualifier("UserService_one")
    UserService userservice;

    @Test
    public void testSelectByPrimaryKey1() {
        UserWithBLOBs user=userservice.selectByPrimaryKey1("fjx");
         this.logger.info(userservice.selectByPrimaryKey1("fjx").toString());
    }

    @Test
    public  void testSelectByPrimaryKey2() {
        UserWithBLOBs user=userservice.selectByPrimaryKey2("1");
        this.logger.info(userservice.selectByPrimaryKey2("1").toString());
    }
}
