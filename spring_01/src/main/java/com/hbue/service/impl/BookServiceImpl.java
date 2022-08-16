package com.hbue.service.impl;

import com.hbue.dao.BookDao;
import com.hbue.dao.impl.BookDaoImpl;
import com.hbue.service.BookService;

public class BookServiceImpl implements BookService {

    @Override
    public void save() {
        BookDao bookDao = new BookDaoImpl();
        bookDao.save();
        System.out.println("bookservice 运行了");
    }
}
