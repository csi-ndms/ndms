package com.nfi.ndms.beans;

import java.sql.Date;

public class Order {
	private int id;
	private String goodsId;
	private String goodsName;
	private double unitPrice;
	private int amount;
	private String unitType;
	private double total;
	private int supplierId;
	private String storeHouse;
	private Date orderTime;
	private Date receiptTime;
	private String orderPeople;
	private Date auditTime;
	private String auditor;
	private String status;
	private String remark;
	private Supplier supplier;
	
	public Order() {
		super();
	}

	public Order(String goodsId, String goodsName, double unitPrice, int amount, String unitType, double total, int supplierId,
			String storeHouse, Date orderTime, Date receiptTime, String orderPeople, Date auditTime, String auditor,
			String status, String remark) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.unitType = unitType;
		this.total = total;
		this.supplierId = supplierId;
		this.storeHouse = storeHouse;
		this.orderTime = orderTime;
		this.receiptTime = receiptTime;
		this.orderPeople = orderPeople;
		this.auditTime = auditTime;
		this.auditor = auditor;
		this.status = status;
		this.remark = remark;
	}

	public Order(int id, String goodsId, String goodsName, double unitPrice, int amount, String unitType, double total,
			int supplierId, String storeHouse, Date orderTime, Date receiptTime, String orderPeople, Date auditTime,
			String auditor, String status, String remark, Supplier supplier) {
		super();
		this.id = id;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.unitType = unitType;
		this.total = total;
		this.supplierId = supplierId;
		this.storeHouse = storeHouse;
		this.orderTime = orderTime;
		this.receiptTime = receiptTime;
		this.orderPeople = orderPeople;
		this.auditTime = auditTime;
		this.auditor = auditor;
		this.status = status;
		this.remark = remark;
		this.supplier = supplier;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getStoreHouse() {
		return storeHouse;
	}

	public void setStoreHouse(String storeHouse) {
		this.storeHouse = storeHouse;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getReceiptTime() {
		return receiptTime;
	}

	public void setReceiptTime(Date receiptTime) {
		this.receiptTime = receiptTime;
	}

	public String getOrderPeople() {
		return orderPeople;
	}

	public void setOrderPeople(String orderPeople) {
		this.orderPeople = orderPeople;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
