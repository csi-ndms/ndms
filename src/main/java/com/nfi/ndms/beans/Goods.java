package com.nfi.ndms.beans;

public class Goods {
	private int id;
	private String goodsId;
	private String goodsName;
	private String goodsType;
	private String unitType;
	private double price;
	private String approval;
	
	public Goods() {
		super();
	}

	public Goods(String goodsId, String goodsName, String goodsType, String unitType, double price, String approval) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsType = goodsType;
		this.unitType = unitType;
		this.price = price;
		this.approval = approval;
	}

	public Goods(int id, String goodsId, String goodsName, String goodsType, String unitType, double price,
			String approval) {
		super();
		this.id = id;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsType = goodsType;
		this.unitType = unitType;
		this.price = price;
		this.approval = approval;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsTypeId(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}


}
