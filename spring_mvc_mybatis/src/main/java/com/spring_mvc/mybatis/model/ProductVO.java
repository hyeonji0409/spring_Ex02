package com.spring_mvc.mybatis.model;

public class ProductVO {
	private String prdNo;
	private String prdName;
	private int prdPrice;
	private String prdCompany;
	private String prdStock;
	
	public String getPrdNo() {
		return prdNo;
	}
	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}
	public String getPrdCompany() {
		return prdCompany;
	}
	public void setPrdCompany(String prdCompany) {
		this.prdCompany = prdCompany;
	}
	public String getPrdStock() {
		return prdStock;
	}
	public void setPrdStock(String prdStock) {
		this.prdStock = prdStock;
	}
	
}
