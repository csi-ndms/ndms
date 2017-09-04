package com.nfi.ndms.controller;


import java.text.ParseException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nfi.ndms.beans.Order;
import com.nfi.ndms.service.OrderService;

@Controller
public class OrderContoller {
	
	@RequestMapping("begin")
	public String begin(Model model){
		List<Order> orders = new ArrayList<>();
		orders = new OrderService().getAllOrder();
		model.addAttribute("orders",orders);
		return "orderList";
	}


	@RequestMapping(value="addList",method=RequestMethod.POST)
	public String addOrder(@RequestParam(value="number") String goodsId,
			@RequestParam(value="drugname") String goodsname,
			@RequestParam(value="unitType") String unitType,
			@RequestParam(value="storehouse") String storehouse,
			@RequestParam(value="supplierid") int supplierId,
			@RequestParam(value="price") double price,
			@RequestParam(value="amount") int amount,
			@RequestParam(value="receipttime") Date receipttime,
			Model model) throws ParseException{
		java.util.Date date1 = new java.util.Date();
		Date orderTime = new Date(date1.getTime());
		
		Order order = new Order(goodsId,goodsname,price,amount,unitType,price*amount,supplierId,storehouse,
				orderTime,receipttime,"xiaoA",null,null,"´ýÉóºË",null);
		new OrderService().addOrder(order);
		List<Order> orders = new ArrayList<>();
		orders = new OrderService().getAllOrder();
		model.addAttribute("orders",orders);
		return "orderList";
	}
	
	@RequestMapping("auditOrder")
	public String getOrderByStatus(Model model){
		List<Order> orders = new ArrayList<>();
		orders = new OrderService().getOrderByStatus("´ýÉóºË");
		model.addAttribute("orders",orders);
		return "auditList";
	}
	
	@RequestMapping(value="updateOrder",method=RequestMethod.POST)
	public String updateOrder(Model model,@RequestParam(value="id") int id,
			@RequestParam(value="auditor") String auditor,
			@RequestParam(value="status") String status,
			@RequestParam(value="remark") String remark){
		System.out.println(id +"  "+ auditor+"  "+status+"  "+remark+"  ");
		new OrderService().updateOrder(auditor, status, remark,id);
		List<Order> orders = new ArrayList<>();
		orders = new OrderService().getOrderByStatus("´ýÉóºË");
		model.addAttribute("orders",orders);
		return "auditList";

	}
	
	@RequestMapping(value="searchOrders",method=RequestMethod.GET)
	public String getOrderByWhere(Model model,@RequestParam(value="thisOrderman") String thisOrderman,
			@RequestParam(value="thisAudit") String thisAudit,
			@RequestParam(value="thisGoodName") String thisGoodName){
		List<Order> orders = new ArrayList<>();
		Order order = new Order(null,thisGoodName,0,0,null,0,0,null,null,null,thisOrderman,null,thisAudit,null,null);
		orders = new OrderService().getOrderByWhere(order);
		model.addAttribute("orders",orders);
		return "orderList";
	}
	
	@RequestMapping(value="searchSimple",method=RequestMethod.GET)
	public String getOrderByWhere(Model model,@RequestParam(value="id") int id){
		Order order = new OrderService().getOrderById(id);
		model.addAttribute("order",order);
		return "auditSimple";
	}
}
