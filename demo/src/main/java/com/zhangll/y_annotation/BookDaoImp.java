package com.zhangll.y_annotation;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImp implements BookDao {

    @Override
    public void save() {
        System.out.println("成功导入书本");
    }

}
