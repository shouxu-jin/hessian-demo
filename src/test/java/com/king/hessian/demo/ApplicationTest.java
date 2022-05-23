package com.king.hessian.demo;

import org.junit.jupiter.api.Test;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

class ApplicationTest {
    @Test
    public void test() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceInterface(Hello.class);
        factory.setServiceUrl("http://localhost:8080/hello");
        factory.afterPropertiesSet();
        Hello hello = (Hello) factory.getObject();
        System.out.println(hello.hello());
    }
}
