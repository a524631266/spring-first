package com.zhangll.a_try;

public class BookServiceImp implements BookService {

    // 方式一 ，老式创建依赖注入
    private BookDao bookDao = new BookDaoImp();
    // 方式一 ，新式创建依赖注入
    private BookDao bookDao2;

    @Override
    public void addBook() {
        System.out.println("service 中的 book");
        bookDao2.addBook();
    }

    /**
     * @return the bookDao
     */
    public BookDao getBookDao() {
        return bookDao2;
    }

    /**
     * @param bookDao the bookDao to set
     */
    public void setBookDao2(BookDao bookDao) {
        this.bookDao2 = bookDao;
    }

}