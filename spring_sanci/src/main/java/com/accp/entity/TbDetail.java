package com.accp.entity;

public class TbDetail {
	public String getBillno() {
		return billno;
	}
	public void setBillno(String billno) {
		this.billno = billno;
	}
	public int getLineid() {
		return lineid;
	}
	public void setLineid(int lineid) {
		this.lineid = lineid;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public int getGoodsnum() {
		return goodsnum;
	}
	public void setGoodsnum(int goodsnum) {
		this.goodsnum = goodsnum;
	}
	public int getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(int goodsprice) {
		this.goodsprice = goodsprice;
	}
	public int getGoodsmoneyamt() {
		return goodsmoneyamt;
	}
	public void setGoodsmoneyamt(int goodsmoneyamt) {
		this.goodsmoneyamt = goodsmoneyamt;
	}
	public int getIspresent() {
		return ispresent;
	}
	public void setIspresent(int ispresent) {
		this.ispresent = ispresent;
	}
	private String billno;  
	private int lineid; 
	private String goodsname; 
	private int goodsnum; 
	private int goodsprice; 
	private int goodsmoneyamt; 
	private int ispresent;
}
