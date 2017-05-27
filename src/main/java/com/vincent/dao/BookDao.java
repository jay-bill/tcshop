package com.vincent.dao;

import java.util.List;

import com.vincent.pojo.Book;
/**
 * book操作接口
 * @author jaybill
 *
 */
public interface BookDao {
	
	int addBooks(List<Book> bookList);
}
