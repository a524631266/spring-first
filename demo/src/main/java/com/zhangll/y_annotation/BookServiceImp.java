package com.zhangll.y_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("serviceid")
// @Scope("prototype") // 默认是单例的，scope可以指定是否多例
public class BookServiceImp implements BookService {

    // 方法1 会出现错误expected single matching bean but found 2: bookDaoImp,bookDaoImp2
    // @Autowired
    // private BookDao bookDao;
    // 方法2
    // @Autowired
    // @Qualifier("dao2")
    // private BookDao bookDao;
    // 方法3
    @Resource(name = "dao2")
    private BookDao bookDao;

    @Override
    public void addBook() {
        System.out.println("让 dao导入数据");
        bookDao.save();
    }

    @PostConstruct
    private void init() {
        // 在每次创建新对象的时候会执行该方法，所以在单例模式下无法第二次使用
        System.out.println("初始化方法之前");
    }

    @PreDestroy
    private void destroy() {
        // 销毁操作在多例模式下是不会执行的
        System.out.println("销毁");
    }

}