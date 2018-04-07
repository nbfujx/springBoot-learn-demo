package test.com.goku.demo.repository;


import com.alibaba.fastjson.JSON;
import com.goku.demo.DemoApplication;
import com.goku.demo.entity.SysUser;
import com.goku.demo.repository.SysUserRepository;
import com.goku.demo.repository.ext.SysMenuExtRepository;
import com.goku.demo.repository.ext.SysUserExtRepository;
import com.goku.demo.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TestUserRepositroy {

    @Autowired
    SysUserExtRepository sysUserExtRepository;
    @Autowired
    SysUserRepository sysUserRepository;
    @Autowired
    SysUserService sysUserService;

    @Test
    public void getSysUserWithRoleAndMenu() {
       System.out.print(JSON.toJSONString(sysUserExtRepository.getSysUserWithRoleAndMenu("999")));
    }

    @Test
    public void findById() {
        System.out.print(JSON.toJSONString(sysUserRepository.findById("999")));
    }

    @Test
    public void findByUsername() {
        System.out.print(JSON.toJSONString(sysUserRepository.findByUsername("admin")));
    }

    @Test
    public void getSysUserInfo() {
        SysUser sysUser=sysUserService.getSysUser("999");
        System.out.print(JSON.toJSONString(sysUserService.listUserPermissionPO(sysUser)));
        System.out.print(JSON.toJSONString(sysUserService.listUserRolePO(sysUser)));
    }



}
