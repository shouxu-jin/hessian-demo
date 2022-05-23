package com.king.hessian.demo;


import org.springframework.stereotype.Service;

@Service
public class HelloImpl implements Hello {
    @Override
    public String hello() {
        return "hello world";
    }
}
