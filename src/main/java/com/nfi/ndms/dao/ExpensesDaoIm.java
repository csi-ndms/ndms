package com.nfi.ndms.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.nfi.ndms.beans.Expenses;
import com.nfi.ndms.data.IExpenses;

public class ExpensesDaoIm extends ExpensesDao {
	private SqlSessionTemplate sql;

	public SqlSessionTemplate getSql() {
		return sql;
	}

	public void setSql(SqlSessionTemplate sql) {
		this.sql = sql;
	}

	@Override
	public void addExpenses(Expenses expenses) {
		// TODO Auto-generated method stub
		IExpenses expen = sql.getMapper(IExpenses.class);
		expen.addExpenses(expenses);					
		
	}

	@Override
	public List<Expenses> getExpenses(String date1,String date2,String type) {
		// TODO Auto-generated method stub
		List<Expenses> exs = null;
		IExpenses expen = sql.getMapper(IExpenses.class);
		exs = expen.getExpenses(date1, date2,type);
		return exs;
	}

	@Override
	public void addIncome(Expenses expenses) {
		// TODO Auto-generated method stub
		IExpenses expen = sql.getMapper(IExpenses.class);
		expen.addIncome(expenses);
	}

	@Override
	public List<Expenses> getIncome(String date1, String date2, String type) {
		// TODO Auto-generated method stub
		List<Expenses> exs = null;
		IExpenses expen = sql.getMapper(IExpenses.class);
		exs = expen.getIncome(date1, date2, type);
		return exs;
	}

}
