package com.vincent.service;

import com.vincent.pojo.Catalog;
import com.vincent.vo.Catalogs;

import java.util.List;

public interface CatalogService {

	int insert(List<Catalog> catalogs);
	
	 List<Catalogs> getChildrens(Catalog catalog);

	void updateCatalog(Catalog catalog);

	Long addCatalog(Catalog catalog);
	
	void removeCatalog(Catalog catalog);
}
