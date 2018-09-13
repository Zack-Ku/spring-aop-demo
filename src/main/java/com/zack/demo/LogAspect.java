package com.zack.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author Zack
 * @date 2018/9/13
 */
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.zack.demo..*(..))")
    private void allMethod() {
    }

    @Before("allMethod()")
    public void before(JoinPoint call) {
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className + "." + methodName + "()开始执行...");
    }

    @After("allMethod()")
    public void after(JoinPoint call) {
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className + "." + methodName + "()方法结束...");
    }
}
