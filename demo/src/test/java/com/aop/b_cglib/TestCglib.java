package com.aop.b_cglib;

import org.junit.Test;

public class TestCglib {
    @Test
    public void testcglib() {
        UserServicImp us = ProxyFactoryB.create();
        us.addBook();
        us.deleteBook();
        us.updateBook();
    }
}