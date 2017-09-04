package com.nfi.ndms.service;


import java.util.Date;
import java.util.List;

import com.nfi.ndms.beans.Expenses;
import com.nfi.ndms.dao.ExpensesDao;

public class ExpensesService {
	/**
	 * 添加支出
	 * @param expenses
	 */
	public void addExpenses(Expenses expenses)
	{
		ExpensesDao ex = ExpensesDao.newinstance();
		ex.addExpenses(expenses);
	}
	/**
	 * 获取某个时间段的支出
	 * @param date1
	 * @param date2
	 * @return
	 */
	public List<Expenses> getExpenses(String date1, String date2,String type)
	{
		List<Expenses> exs = null;
		ExpensesDao ex = ExpensesDao.newinstance();
		exs = ex.getExpenses(date1, date2,type);
		return exs;
	}
	
	/**
	 * 添加支出
	 * @param expenses
	 */
	public void addIncome(Expenses expenses)
	{
		ExpensesDao ex = ExpensesDao.newinstance();
		ex.addIncome(expenses);
	}
	/**
	 * 获取某个时间段的支出
	 * @param date1
	 * @param date2
	 * @return
	 */
	public List<Expenses> getIncome(String date1, String date2,String type)
	{
		List<Expenses> exs = null;
		ExpensesDao ex = ExpensesDao.newinstance();
		exs = ex.getIncome(date1, date2, type);
		return exs;
	}
	
	
	public static void  main(String [] ages)
	{
		Date d = new Date();
		java.sql.Date date1 = new java.sql.Date(d.getTime());
		Expenses es = new Expenses(0,date1,"皮肤","亚索","","",-200.0);
		
		ExpensesService ex = new ExpensesService();
		ex.addExpenses(es);
		
		System.out.println(date1);
	}
}
