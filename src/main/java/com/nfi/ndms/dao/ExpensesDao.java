package com.nfi.ndms.dao;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.nfi.ndms.beans.Expenses;
@Transactional
public abstract class ExpensesDao {
	/**
	 * 获取实现类
	 * @return
	 */
	public static ExpensesDao newinstance()
	{
		ApplicationContext app = new ClassPathXmlApplicationContext("spring_config.xml");
		ExpensesDao exp = (ExpensesDaoIm)app.getBean("ExpensesDaoIm");
		return exp;
	}
	/**
	 * 财务日常支出添加
	 * @param espenses
	 */
	public abstract void addExpenses(Expenses expenses);
	/**
	 * 根据一段时间查询日常支出
	 * @return
	 */
	public abstract List<Expenses> getExpenses(String date1 , String date2 , String type);
	/**
	 * 添加日常收入到数据库中
	 * @param expenses
	 */
	public abstract void addIncome(Expenses expenses);
	/**
	 * 根据一段时间获取日常收入
	 * @param data1
	 * @param data2
	 * @param type
	 * @return
	 */
	public abstract List<Expenses> getIncome(String date1 , String date2 , String type);

}
