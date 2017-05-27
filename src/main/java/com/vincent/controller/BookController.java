package com.vincent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vincent.pojo.Book;
import com.vincent.service.BookService;

/**
 * book控制器
 * @author jaybill
 *
 */
@Controller
@RequestMapping("book")
public class BookController {
	
	@Autowired
	private BookService bs;
	
	/**
	 * 添加书籍
	 * @param bookList
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public int addBook(List<Book> bookList){
		return bs.insert(bookList);
	}
}
