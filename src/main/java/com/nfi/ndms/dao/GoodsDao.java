package com.nfi.ndms.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.nfi.ndms.beans.Goods;
import com.nfi.ndms.data.GoodsMapper;

public class GoodsDao {
	SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public void addGoods(Goods goods){
		GoodsMapper goodsMapper = sqlSessionTemplate.getMapper(GoodsMapper.class);
		goodsMapper.addGoods(goods);
	}
	
	public Goods getGoodsById(String goodsId){
		GoodsMapper goodsMapper = sqlSessionTemplate.getMapper(GoodsMapper.class);
		return goodsMapper.getGoodsById(goodsId);
	}
	
	public void updateGoods(Goods goods){
		GoodsMapper goodsMapper = sqlSessionTemplate.getMapper(GoodsMapper.class);
		goodsMapper.updateGoods(goods);
	}
	
	public void deleteGoods(int id){
		GoodsMapper goodsMapper = sqlSessionTemplate.getMapper(GoodsMapper.class);
		goodsMapper.deleteGoods(id);
	}
	
	public List<Goods> getAllGoods(){
		GoodsMapper goodsMapper = sqlSessionTemplate.getMapper(GoodsMapper.class);
		return goodsMapper.getAllGoods();
	}
}
