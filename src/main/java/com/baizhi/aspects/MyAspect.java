package com.baizhi.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Fy_ on 2020/6/8 14:36
 */
//这是一个切面配置类
@Component
@Aspect
@Order(2)
public class MyAspect {
/*    @Around("within(com.baizhi.service.*ServiceImpl)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("--------在目标方法之前进入环绕通知------------");
        System.out.println("获取方法名:"+proceedingJoinPoint.getSignature().getName());
        System.out.println("获取参数:"+proceedingJoinPoint.getArgs());
        System.out.println("获取对象:"+proceedingJoinPoint.getTarget());
        try {
            Object proceed = proceedingJoinPoint.proceed();
            System.out.println("--------在目标方法之后进入环绕通知------------");

            return proceed;
        }catch(Exception e){
            System.out.println("============目标方法出现异常时处理");
            return null;
        }
    }*/
/*    @After("within(com.baizhi.service.*ServiceImpl)")
    public void after(JoinPoint joinPoint){
        System.out.println("---------进入后置通知-----------");
        System.out.println("当前执行方法名:"+joinPoint.getSignature().getName());
        System.out.println("当前执行方法参数:"+joinPoint.getArgs());
        System.out.println("当前目标对象target:"+joinPoint.getTarget());
    }*/
    //前置通知
    @Before(value="within(com.baizhi.service.*ServiceImpl)")
    //joinpoint 或许当前执行方法对象 方法的参数信息 以及目标对象
    @Order(2)
    public void Before1(JoinPoint joinPoint){
        System.out.println("当前执行方法名:"+joinPoint.getSignature().getName());
        System.out.println("当前执行方法参数:"+joinPoint.getArgs());
        System.out.println("当前目标对象target:"+joinPoint.getTarget());
        System.out.println("----------进入前置通知2-----------");
    }
    @After("within(com.baizhi.service.*ServiceImpl)")
    public void after(JoinPoint joinPoint){
        System.out.println("---------进入后置通知4-----------");

    }
}
