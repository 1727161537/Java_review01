package com.hbue.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.awt.print.Book;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BookMapper {

    public static void main(String[] args) throws IOException {
        //加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlsession工厂对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlsession核心对象
        SqlSession sqlSession = build.openSession();
        List<Book> list = sqlSession.selectList("com.hbue.mapper.findAll");
    }
}
