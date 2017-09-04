package com.nfi.ndms.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nfi.ndms.beans.Expenses;
import com.nfi.ndms.service.ExpensesService;

@Controller
public class Controller1 {
	/**
	 * 添加支出到数据库并转向到页面上显示今天的支出。
	 * @param request
	 * @param date
	 * @param type
	 * @param money
	 * @param name
	 * @param remake
	 * @param correct
	 * @return
	 */
	@RequestMapping("addExpenses")
	public String addExpenses(HttpServletRequest request,
			@RequestParam(value="date") String date,
			@RequestParam(value="type") String type,
			@RequestParam(value="money") String money,
			@RequestParam(value="name") String name,
			@RequestParam(value="remake") String remake,
			@RequestParam(value="correct",defaultValue="否") String correct )
	{
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    
	    java.util.Date date1 = null;
	    Date date2 = null;
	    try {
			date1=sdf.parse(date);
			date2 = new Date(date1.getTime() + 86400000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ExpensesService ex = new ExpensesService();
		ex.addExpenses(new Expenses(0,date2,type,name,remake,correct,Double.valueOf(money)));
		return "redirect:/toAddExpenses";
	}
	/**
	 * 通过传入两个时间参数，查询这段时间的支出。
	 * @param request
	 * @param date1
	 * @param date2
	 * @return
	 */
	@RequestMapping( value="/getExpenses",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getExpenses(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value="date1") String date1,
			@RequestParam(value="date2") String date2,
			@RequestParam(value="type", defaultValue="") String type)
	{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		List<Expenses> exs = null; 
		ExpensesService ex = new ExpensesService();
		if(type.equals(""))
		{
			exs = ex.getExpenses(date1, date2,null);
		}
		else
		{
			exs = ex.getExpenses(date1, date2,type);
		}
	    JSONArray js = new JSONArray(exs);
	    return js.toString();
	}
	/**
	 * 添加收入到数据库中
	 * @param request
	 * @param date
	 * @param type
	 * @param money
	 * @param name
	 * @param remake
	 * @param correct
	 * @return
	 */
	@RequestMapping("addIncome")
	public String addIncome(HttpServletRequest request,
			@RequestParam(value="date") String date,
			@RequestParam(value="type") String type,
			@RequestParam(value="money") String money,
			@RequestParam(value="name") String name,
			@RequestParam(value="remake") String remake,
			@RequestParam(value="correct",defaultValue="否") String correct )
	{
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    
	    java.util.Date date1 = null;
	    Date date2 = null;
	    try {
			date1=sdf.parse(date);
			date2 = new Date(date1.getTime() + 86400000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ExpensesService ex = new ExpensesService();
		ex.addIncome(new Expenses(0,date2,type,name,remake,correct,Double.valueOf(money)));
		return "redirect:/toAddIncome";
	}
	/**
	 * 通过传入两个时间参数，查询这段时间的收入。
	 * @param request
	 * @param date1
	 * @param date2
	 * @return
	 */
	@RequestMapping( value="/getIncome",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getIncome(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value="date1") String date1,
			@RequestParam(value="date2") String date2,
			@RequestParam(value="type", defaultValue="") String type)
	{
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		List<Expenses> exs = null; 
		ExpensesService ex = new ExpensesService();
		if(type.equals(""))
		{
			exs = ex.getIncome(date1, date2, null);
		}
		else
		{
			exs = ex.getIncome(date1, date2,type);
		}
	    JSONArray js = new JSONArray(exs);
	    return js.toString();
	}
	/**
	 * 通过2级菜单访问添加支出页面
	 * @return
	 */
	@RequestMapping("toAddExpenses")
	public String toAddExpenses()
	{
		return "dayExpenditure";
	}
	/**
	 * 通过2级菜单访问添加收入页面
	 * @return
	 */
	@RequestMapping("toAddIncome")
	public String toAddIncome()
	{
		return "income";
	}
	/**
	 * 通过2级菜单访问查询页面
	 */
	@RequestMapping("toQuery")
	public String toQuery()
	{
		return "query";
	}
}
