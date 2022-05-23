package com.king.hessian.demo;


import org.springframework.stereotype.Service;

@Service
public class HelloImpl implements Hello {
    @Override
    public String hello() {
        return "hello world";
    }

    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
