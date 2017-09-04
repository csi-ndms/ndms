package com.nfi.ndms.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.nfi.ndms.beans.Supplier;
import com.nfi.ndms.data.SupplierMapper;

public class SupplierDao {

	SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public void addSupplier(Supplier supplier){
		SupplierMapper sm = sqlSessionTemplate.getMapper(SupplierMapper.class);
		sm.addSupplier(supplier);
	}
	
	public List<Supplier> getAllSupplier(){
		List<Supplier> suppliers = new ArrayList<>();
		SupplierMapper sm = sqlSessionTemplate.getMapper(SupplierMapper.class);
		suppliers = sm.getAllSupplier();
		return suppliers;
	}
}
