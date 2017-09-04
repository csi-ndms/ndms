package com.nfi.ndms.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nfi.ndms.beans.Goods;
import com.nfi.ndms.dao.GoodsDao;

public class GoodsService {
	ApplicationContext context = null;
	GoodsDao goodsDao;
	
	public GoodsService(){
		context = new ClassPathXmlApplicationContext("spring_config.xml");
		goodsDao = (GoodsDao) context.getBean("goodsDao");
	}


	public void addGoods(Goods goods){
		goodsDao.addGoods(goods);
	}
	
	public Goods getGoodsById(String goodsId){
		return goodsDao.getGoodsById(goodsId);
	}
	
	public void updateGoods(Goods goods){
		goodsDao.updateGoods(goods);
	}
	
	public void deleteGoods(int id){
		goodsDao.deleteGoods(id);
	}
	
	public List<Goods> getAllGoods(){
		return goodsDao.getAllGoods();
	}
}
