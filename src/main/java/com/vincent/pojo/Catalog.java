package com.vincent.pojo;

import java.io.Serializable;

public class Catalog implements Serializable {
	

    private Long id;

    private Long fid;

    private String name;

    private String library;

    private String ico;

    private Byte lev;

    private Long order;

    private Boolean hide;
    
    private Byte state;

    private static final long serialVersionUID = 1L;
    
    

    public Catalog() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Catalog(Long id, Long fid, String name, String library, String ico, Byte lev, Long order, Boolean hide,
			Byte state) {
		super();
		this.id = id;
		this.fid = fid;
		this.name = name;
		this.library = library;
		this.ico = ico;
		this.lev = lev;
		this.order = order;
		this.hide = hide;
		this.state = state;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getFid() {
		return fid;
	}



	public void setFid(Long fid) {
		this.fid = fid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name)  {
		this.name = name;
	}



	public String getLibrary() {
		return library;
	}



	public void setLibrary(String library) {
		this.library = library;
	}



	public String getIco() {
		return ico;
	}



	public void setIco(String ico) {
		this.ico = ico;
	}



	public Byte getLev() {
		return lev;
	}



	public void setLev(Byte lev) {
		this.lev = lev;
	}



	public Long getOrder() {
		return order;
	}



	public void setOrder(Long order) {
		this.order = order;
	}



	public Boolean getHide() {
		return hide;
	}



	public void setHide(Boolean hide) {
		this.hide = hide;
	}



	public Byte getState() {
		return state;
	}



	public void setState(Byte state) {
		this.state = state;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Catalog [id=" + id + ", fid=" + fid + ", name=" + name + ", library=" + library + ", ico=" + ico
				+ ", lev=" + lev + ", order=" + order + ", hide=" + hide + ", state=" + state + "]";
	}

	
	
}