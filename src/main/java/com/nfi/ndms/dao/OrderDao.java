package com.nfi.ndms.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.nfi.ndms.beans.Order;
import com.nfi.ndms.data.OrderMapper;

public class OrderDao {
	SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public void addOrder(Order order){
		OrderMapper om = sqlSessionTemplate.getMapper(OrderMapper.class);
		om.addOrder(order);
	}
	
	public Order getOrderById(int id){
		OrderMapper om = sqlSessionTemplate.getMapper(OrderMapper.class);
		return om.getOrderById(id);
	}
	
	public List<Order> getAllOrder(){
		List<Order> orders = new ArrayList<>();
		OrderMapper om = sqlSessionTemplate.getMapper(OrderMapper.class);
		orders = om.getAllOrder();
		return orders;
	}
	
	public List<Order> getOrderByWhere(Order order){
		List<Order> orders = new ArrayList<>();
		OrderMapper om = sqlSessionTemplate.getMapper(OrderMapper.class);
		orders = om.getOrderByWhere(order);
		return orders;
	}
	
	public List<Order> getOrderByStatus(String status){
		List<Order> orders = new ArrayList<>();
		OrderMapper om = sqlSessionTemplate.getMapper(OrderMapper.class);
		orders = om.getOrderByStatus(status);
		return orders;
	}
	
	public void updateOrder(String auditor,String status,String remark,int id){
		OrderMapper om = sqlSessionTemplate.getMapper(OrderMapper.class);
		om.updateOrder(auditor, status, remark,id);
	}
}
