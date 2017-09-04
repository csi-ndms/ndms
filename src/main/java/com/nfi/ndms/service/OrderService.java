package com.nfi.ndms.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nfi.ndms.beans.Order;
import com.nfi.ndms.dao.OrderDao;

public class OrderService {
	ApplicationContext context = null;
	OrderDao orderDao;
	
	public OrderService(){
		context = new ClassPathXmlApplicationContext("spring_config.xml");
		orderDao = (OrderDao) context.getBean("orderDao");
	}
	
	public void addOrder(Order order){
		orderDao.addOrder(order);
	}
	
	public Order getOrderById(int id){
		return orderDao.getOrderById(id);
	}
	
	public List<Order> getAllOrder(){
		return orderDao.getAllOrder();
	}
	
	public List<Order> getOrderByWhere(Order order){
		return orderDao.getOrderByWhere(order);
	}
	
	public List<Order> getOrderByStatus(String status){
		return orderDao.getOrderByStatus(status);
	}
	
	public void updateOrder(String auditor,String status,String remark,int id){
		orderDao.updateOrder(auditor, status, remark,id);
	}
}
