package com.nfi.ndms.data;

import java.util.List;

import com.nfi.ndms.beans.Goods;

public interface GoodsMapper {
	
	public void addGoods(Goods goods);
	
	public Goods getGoodsById(String goodsId);
	
	public void updateGoods(Goods goods);
	
	public void deleteGoods(int id);
	
	public List<Goods> getAllGoods();
}
