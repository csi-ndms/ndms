package com.nfi.ndms.data;

import java.util.List;

import com.nfi.ndms.beans.Supplier;

public interface SupplierMapper {

	public void addSupplier(Supplier supplier);
	
	public List<Supplier> getAllSupplier();
}
