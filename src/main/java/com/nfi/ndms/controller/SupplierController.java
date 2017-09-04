package com.nfi.ndms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nfi.ndms.beans.Supplier;
import com.nfi.ndms.service.SupplierService;

@Controller
public class SupplierController {
	
	@RequestMapping(value="supplier",method=RequestMethod.GET)
	public String link(){
		
		return "addSupplier";
	}
	
	@RequestMapping(value="addSup",method=RequestMethod.POST)
	public String addSupplier(@RequestParam(value="suppliername") String suppliername,
			@RequestParam(value="address") String address,@RequestParam(value="linkman") String linkman,
			@RequestParam(value="phone") String phone){
		new SupplierService().addSupplier(new Supplier(suppliername,address,linkman,phone));
		return "procurement";
	}
	
	@RequestMapping(value="allSupplier",method=RequestMethod.GET)
	public void getAllsupplier(HttpServletResponse response){
		List<Supplier> suppliers = new ArrayList<>();
		suppliers = new SupplierService().getAllSupplier();
		JSONArray supJsonArray = new JSONArray(suppliers);
		try {
			PrintWriter out = response.getWriter();
			out.print(supJsonArray.toString());
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
