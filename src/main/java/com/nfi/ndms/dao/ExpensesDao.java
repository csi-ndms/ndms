package com.nfi.ndms.dao;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.nfi.ndms.beans.Expenses;
@Transactional
public abstract class ExpensesDao {
	/**
	 * ��ȡʵ����
	 * @return
	 */
	public static ExpensesDao newinstance()
	{
		ApplicationContext app = new ClassPathXmlApplicationContext("spring_config.xml");
		ExpensesDao exp = (ExpensesDaoIm)app.getBean("ExpensesDaoIm");
		return exp;
	}
	/**
	 * �����ճ�֧�����
	 * @param espenses
	 */
	public abstract void addExpenses(Expenses expenses);
	/**
	 * ����һ��ʱ���ѯ�ճ�֧��
	 * @return
	 */
	public abstract List<Expenses> getExpenses(String date1 , String date2 , String type);
	/**
	 * ����ճ����뵽���ݿ���
	 * @param expenses
	 */
	public abstract void addIncome(Expenses expenses);
	/**
	 * ����һ��ʱ���ȡ�ճ�����
	 * @param data1
	 * @param data2
	 * @param type
	 * @return
	 */
	public abstract List<Expenses> getIncome(String date1 , String date2 , String type);

}
