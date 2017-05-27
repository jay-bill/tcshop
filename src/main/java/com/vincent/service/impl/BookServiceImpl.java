package com.vincent.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vincent.dao.BookDao;
import com.vincent.pojo.Book;
import com.vincent.service.BookService;

/**
 * book服务类
 * @author jaybill
 *
 */
@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Transactional
	public int insert(List<Book> bookList) {
		return bookDao.addBooks(bookList);
	}

}
