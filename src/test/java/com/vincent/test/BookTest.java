package com.vincent.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vincent.dao.BookDao;
import com.vincent.pojo.Book;
import com.vincent.service.BookService;

/**
 * 
 * @author jaybill
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/spring/spring-service.xml")
public class BookTest {
	@Autowired
	private BookService bs;

	@Test
	public void test(){
		List<Book> lBook = new ArrayList<Book>();
		lBook.add(new Book((long)12064626,"1713,3258,3297",(long)3297));
		lBook.add(new Book((long)12064979,"1713,3258,3297",(long)3297));
		int res = bs.insert(lBook);
		System.out.println(res);
	}
}
