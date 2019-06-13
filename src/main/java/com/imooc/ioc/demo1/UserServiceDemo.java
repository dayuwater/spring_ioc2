package com.imooc.ioc.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceDemo {

    @Test
    public void traditional(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setName("Spring");
        userService.sayHello();
    }

    @Test
    public void useSpringApplicationContext(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    public void printFood(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food fd = (Food) applicationContext.getBean("food");
        System.out.println(fd.toString());
    }
}
