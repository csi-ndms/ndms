package com.nfi.ndms.data;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nfi.ndms.beans.Expenses;

public interface IExpenses {
	public void addExpenses(Expenses expenses);
	public List<Expenses> getExpenses( @Param("date1")String date1 ,
			@Param("date2")String date2,@Param("type")String type);
	public void addIncome(Expenses expenses);
	public List<Expenses> getIncome( @Param("date1")String date1 ,
			@Param("date2")String date2,@Param("type")String type);
}
