package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.apache.ibatis.javassist.expr.NewArray;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by Fy_ on 2020/6/5 16:46
 */
public class UserServiceTest extends BasicTest {
    @Autowired
    private UserService userservice;

    @Test
    public  void testSave(){
        User user=new User();
        user.setName("吃屎").setAge(37).setBir(new Date());
        userservice.save(user);
    }
    @Test
    public void testFindAll(){
        userservice.findAll().forEach(users-> System.out.println(users));
    }
}
