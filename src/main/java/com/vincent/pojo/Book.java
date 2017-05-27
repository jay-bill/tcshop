package com.vincent.pojo;

import java.io.Serializable;

/**
 * 书籍类
 * @author jaybill
 *
 */
public class Book implements Serializable{
	private static final long serialVersionUID = -6595538066686624158L;
	private Long stk;
	private String category;
	private Long fid;
	public Book(){}
	public Book(Long stk, String category, Long fid) {
		super();
		this.stk = stk;
		this.category = category;
		this.fid = fid;
	}
	public Long getStk() {
		return stk;
	}
	public void setStk(Long stk) {
		this.stk = stk;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getFid() {
		return fid;
	}
	public void setFid(Long fid) {
		this.fid = fid;
	}
	@Override
	public String toString() {
		return "Book [stk=" + stk + ", category=" + category + ", fid=" + fid + "]";
	}
}
