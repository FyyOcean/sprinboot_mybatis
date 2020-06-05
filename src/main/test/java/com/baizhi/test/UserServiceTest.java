package com.baizhi.test;

import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Fy_ on 2020/6/5 16:46
 */
public class UserServiceTest extends BasicTest {
    @Autowired
    private UserService userservice;

    @Test
    public void testFindAll(){
        userservice.findAll().forEach(users-> System.out.println(users));
    }
}
