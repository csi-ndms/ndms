package com.nfi.ndms.beans;

public class Supplier {
	
	private int supplierId;
	private String supplierName;
	private String address;
	private String linkman;
	private String phone;
	
	public Supplier() {
		super();
	}

	public Supplier(String supplierName, String address, String linkman, String phone) {
		super();
		this.supplierName = supplierName;
		this.address = address;
		this.linkman = linkman;
		this.phone = phone;
	}

	public Supplier(int supplierId, String supplierName, String address, String linkman, String phone) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.address = address;
		this.linkman = linkman;
		this.phone = phone;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
