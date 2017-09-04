package com.nfi.ndms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nfi.ndms.beans.Goods;
import com.nfi.ndms.service.GoodsService;


@Controller
public class GoodsController {
	
	@RequestMapping(value="procurement",method=RequestMethod.GET)
	public String begin(){
		return "procurement";
	}
	
	@RequestMapping(value="addGoods",method=RequestMethod.POST)
	public String addGoods(@RequestParam(value="goodsid") String goodsId,
			@RequestParam(value="goodsname") String goodsName,
			@RequestParam(value="goodstypeid") String goodsType,
			@RequestParam(value="unittype") String unitType,
			@RequestParam(value="price") double price,
			@RequestParam(value="approval") String approval){
		Goods goods = new Goods(goodsId,goodsName,goodsType,unitType,price,approval);
		new GoodsService().addGoods(goods);
		return "goodsList";
	}
	
	@RequestMapping(value="searchGoods",method=RequestMethod.GET)
	public void getGoodsById(@RequestParam(value="goodsId") String goodsId,HttpServletResponse response){
		if (goodsId != null && !goodsId.equals("")){
			Goods goods = new GoodsService().getGoodsById(goodsId);
			PrintWriter out;
			try {
				out = response.getWriter();
				if(goods != null){
					JSONObject jsonGoods = new JSONObject(goods);
					out.print(jsonGoods.toString());
					out.close();
				}
				else{
					String msg = "该商品不存在，请添加商品类";
					out.print(msg);
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@RequestMapping(value="allGoods", method=RequestMethod.GET)
	public void getAllGoods(HttpServletResponse response){
		List<Goods> allGoods = new ArrayList<>();
		allGoods = new GoodsService().getAllGoods();
		
		try {
			if (allGoods != null){
				PrintWriter out = response.getWriter();
				JSONArray jsonAllGoods = new JSONArray(allGoods);
				out.print(jsonAllGoods);
				out.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	@RequestMapping(value="deleteGoods", method=RequestMethod.GET)
	public String deleteGoods(@RequestParam(value="id") int id){
		new GoodsService().deleteGoods(id);
		return "goodsList";
	}
	
	@RequestMapping("test")
	public String Goods(){
		
		return "goodsList";
	}
	
	@RequestMapping("pharmaceuticals")
	public String pharmaceuticals(){
		return "pharmaceuticals";
	}
}
