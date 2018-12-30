package com.zhangll.proxyfactory;

import org.junit.Test;

public class TestProxy {
    @Test
    public void testproxy() {
        Person pf = (Person) ProxyFactory.createPerson();
        pf.eat();
    }
}