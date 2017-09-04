package com.nfi.ndms.service;


import java.util.Date;
import java.util.List;

import com.nfi.ndms.beans.Expenses;
import com.nfi.ndms.dao.ExpensesDao;

public class ExpensesService {
	/**
	 * ���֧��
	 * @param expenses
	 */
	public void addExpenses(Expenses expenses)
	{
		ExpensesDao ex = ExpensesDao.newinstance();
		ex.addExpenses(expenses);
	}
	/**
	 * ��ȡĳ��ʱ��ε�֧��
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
	 * ���֧��
	 * @param expenses
	 */
	public void addIncome(Expenses expenses)
	{
		ExpensesDao ex = ExpensesDao.newinstance();
		ex.addIncome(expenses);
	}
	/**
	 * ��ȡĳ��ʱ��ε�֧��
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
		Expenses es = new Expenses(0,date1,"Ƥ��","����","","",-200.0);
		
		ExpensesService ex = new ExpensesService();
		ex.addExpenses(es);
		
		System.out.println(date1);
	}
}
