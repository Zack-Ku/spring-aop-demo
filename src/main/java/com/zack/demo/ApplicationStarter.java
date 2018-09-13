package com.zack.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zack
 * @date 2018/9/12
 */
public class ApplicationStarter {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-test.xml");

        TestBean testBean = (TestBean) ctx.getBean("testBean");

        String str = testBean.getStr();
    }
}
