package com.vincent.controller;

import com.vincent.pojo.Catalog;
import com.vincent.vo.Catalogs;
import com.vincent.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="catalog")
public class CatalogController {
	
	@Autowired
	private CatalogService catalogService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<Catalogs> getCatalog(Catalog catalog){

	      return catalogService.getChildrens(catalog);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	@ResponseBody
	public void updateCatalog(Catalog catalog){
		catalogService.updateCatalog(catalog);

	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public long addCatalog(Catalog catalog){

		return catalogService.addCatalog(catalog);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public void removeCatalog(@PathVariable("id")String id){

		Catalog catalog = new Catalog();
		
		catalog.setId(Long.valueOf(id));
		
		catalogService.removeCatalog(catalog);

	}
	
	

}
