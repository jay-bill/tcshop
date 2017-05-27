package com.vincent.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.vincent.dao.CatalogDao;
import com.vincent.pojo.Catalog;
import com.vincent.service.CatalogService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/spring/spring-service.xml")
public class MyTest {
	
		@Autowired					
    	private CatalogService catalogService;
		
		@Autowired
		private CatalogDao catalogDao;
		
		@Test
		public void fun(){
			
			Catalog catalog = new Catalog();
			catalog.setId((long) 13811);
			catalogService.removeCatalog(catalog );
			
		}
		

}
