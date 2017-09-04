package com.nfi.ndms.data;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nfi.ndms.beans.Order;

public interface OrderMapper {
	
	public void addOrder(Order order);
	
	public void updateOrder(@Param("auditor")String auditor,@Param("status")String status,@Param("remark")String remark,@Param("id")int id);
	
	public Order getOrderById(int id);
	
	public List<Order> getAllOrder();
	
	public List<Order> getOrderByWhere(Order order);
	
	public List<Order> getOrderByStatus(String status);
}
