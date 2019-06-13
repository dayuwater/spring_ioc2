package com.imooc.ioc.demo1;

import java.util.List;

public class UserServiceImpl implements UserService{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void sayHello() {
        System.out.println("Hello " + name);

    }
}
