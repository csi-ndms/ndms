package com.nfi.ndms.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nfi.ndms.beans.Supplier;
import com.nfi.ndms.dao.SupplierDao;

public class SupplierService {
	ApplicationContext context = null;
	SupplierDao supplierDao;
	
	public SupplierService(){
		context = new ClassPathXmlApplicationContext("spring_config.xml");
		supplierDao = (SupplierDao) context.getBean("supplierDao");
	}
	
	public void addSupplier(Supplier supplier){
		supplierDao.addSupplier(supplier);
	}
	
	public List<Supplier> getAllSupplier(){
		return supplierDao.getAllSupplier();
	}
}
