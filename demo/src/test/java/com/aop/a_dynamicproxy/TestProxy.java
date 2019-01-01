package com.aop.a_dynamicproxy;

import org.junit.Test;

public class TestProxy {
    @Test
    public void testProxy() {
        UserService us = ProxyFactoryB.create();
        us.addBook();
        us.updateBook();
        us.deleteBook();
    }

    @Test
    public void testProxy2() {
        UserService us = ProxyFactoryB.create2();
        us.addBook();
        us.updateBook();
        us.deleteBook();
    }
}