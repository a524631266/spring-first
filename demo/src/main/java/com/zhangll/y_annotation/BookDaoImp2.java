package com.zhangll.y_annotation;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

// @Controller 也能实现功能
@Repository("dao2")
public class BookDaoImp2 implements BookDao {
    @Override
    public void save() {
        System.out.println("成功导入书本2");
    }

}
