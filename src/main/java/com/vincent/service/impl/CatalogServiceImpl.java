package com.vincent.service.impl;
import com.vincent.dao.CatalogDao;
import com.vincent.vo.Catalogs;
import com.vincent.pojo.Catalog;
import com.vincent.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("catalogService")
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private CatalogDao catalogDao;
	


	public int insert(List<Catalog> catalogs) {
		
		catalogDao.insert(catalogs);
		
		return 0;
	}

	/**
	 * 获取所有子节点
	 */

	public List<Catalogs> getChildrens(Catalog catalog) {
		
		List<Catalog> catalogs = catalogDao.selectByFid(catalog);
		
		List<Catalogs> childrens = new ArrayList<Catalogs>();
		
		for(Catalog ctl:catalogs){
			
			Catalogs dto = new Catalogs();
			
			byte state = ctl.getState();
			
			if(state==0){
				dto.setState("opened");
			}else{
				dto.setState("closed");
			}
			dto.setText(ctl.getName());
			dto.setId(ctl.getId());
			childrens.add(dto);
		}
		
		return childrens;
		
	}

	public void updateCatalog(Catalog catalog) {
		catalogDao.updateCatalog(catalog);
	}

	public Long addCatalog(Catalog catalog) {
		
	   catalogDao.addCatalog(catalog);
		long id = catalog.getId();
		return id;
		
	}

	public void removeCatalog(Catalog catalog) {
		
		catalogDao.removeCatalog(catalog);

		
	}


	
}
