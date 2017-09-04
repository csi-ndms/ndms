package com.nfi.ndms.beans;

import java.sql.Date;

public class Expenses {
	private int expensesId;
	private Date date;	
	private String type;
	private String name;
	private String remake;
	private String correct;
	private Double money;
	
	public Expenses() {
		super();
	}


	public Expenses(int expensesId, Date date, String type, String name, String remake, String correct,Double money) {
		super();
		this.expensesId = expensesId;
		this.date = date;
		this.type = type;
		this.name = name;
		this.remake = remake;
		this.correct = correct;
		this.money = money;
	}


	public int getExpensesId() {
		return expensesId;
	}


	public void setExpensesId(int expensesId) {
		this.expensesId = expensesId;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRemake() {
		return remake;
	}


	public void setRemake(String remake) {
		this.remake = remake;
	}


	public String getCorrect() {
		return correct;
	}


	public void setCorrect(String correct) {
		this.correct = correct;
	}


	public Double getMoney() {
		return money;
	}


	public void setMoney(Double money) {
		this.money = money;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.correct + this.name + this.remake + this.money;
	}
	
}
