package com.hbue.service.impl;

import com.hbue.dao.BookDao;
import com.hbue.service.BookService;

public class BookServiceImpl  implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        bookDao.save();
        System.out.println("service 层运行了");
    }
}
