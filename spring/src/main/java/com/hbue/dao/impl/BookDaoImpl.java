package com.hbue.dao.impl;

import com.hbue.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("dao 层运行了");
    }
}
