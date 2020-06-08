package com.baizhi.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Fy_ on 2020/6/8 16:35
 */
@Component
@Aspect
@Order(1)
public class MyAspect2 {
    @Before(value="within(com.baizhi.service.*ServiceImpl)")
    //joinpoint 或许当前执行方法对象 方法的参数信息 以及目标对象
    @Order(1)
    public void Before2(JoinPoint joinPoint){
        System.out.println("当前执行方法名:"+joinPoint.getSignature().getName());
        System.out.println("当前执行方法参数:"+joinPoint.getArgs());
        System.out.println("当前目标对象target:"+joinPoint.getTarget());
        System.out.println("----------进入前置通知1-----------");
    }
    @After("within(com.baizhi.service.*ServiceImpl)")
    public void after(JoinPoint joinPoint){
        System.out.println("---------进入后置通知3-----------");

    }
}
