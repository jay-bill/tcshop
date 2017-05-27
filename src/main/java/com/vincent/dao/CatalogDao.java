package com.vincent.dao;

import com.vincent.pojo.Catalog;

import java.util.List;

public interface CatalogDao {
  
    void insert(List<Catalog> catalogs);
    
    /**
     * 获取所有子节点
     * @return
     */
    List<Catalog> selectByFid(Catalog catalog);
    

	void updateCatalog(Catalog catalog);

	void addCatalog(Catalog catalog);

	void removeCatalog(Catalog catalog);
    

}