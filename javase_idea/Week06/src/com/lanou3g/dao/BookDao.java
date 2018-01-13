package com.lanou3g.dao;

import com.lanou3g.domain.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.lanou3g.utils.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookDao {

    public List showAll() throws SQLException {
        List<Book> books = new QueryRunner().query(
                JdbcUtil.getConnection(),
                "select * from book",
                new BeanListHandler<>(Book.class));

        return books;
    }

    public Book showOne(String bookname) throws SQLException {
        Book book = new QueryRunner().query(
                JdbcUtil.getConnection(),
                "select * from book where bookname=?",
                new BeanHandler<>(Book.class),
                bookname);

        return book;
    }



    public void insertBook(Book book){

        JdbcUtil.execute(coon -> {
            PreparedStatement pstate = coon.prepareStatement("INSERT INTO book VALUES (NULL ,?,?,?)");
            pstate.setString(1,book.getBookname());
            pstate.setString(2,book.getAuthor());
            pstate.setString(3,book.getPrice());

            System.out.println(book.getBookname() + book.getAuthor() + book.getPrice());
            pstate.addBatch();
            pstate.executeBatch();
            return pstate;
        });



    }

}
