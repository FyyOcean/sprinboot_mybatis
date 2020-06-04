package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Fy_ on 2020/6/4 17:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= Application.class)
public class BasicTest {
    @Autowired
    private UserService userservice;

    @Test
    public void testFindAll(){
        userservice.findAll().forEach(users-> System.out.println(users));
    }
}
