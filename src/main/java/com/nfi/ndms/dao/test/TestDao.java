/**
 * 
 */
package com.nfi.ndms.dao.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.nfi.ndms.beans.test.Test;
import com.nfi.ndms.data.test.TestMapper;

/**
 * @author Leucippus
 * @since 2017 08 29 14:56:17 Tuesday
 * @version 
 */
public class TestDao {
	@Autowired
	private TestMapper testMapper;
	
	public Test getById(int id) {
		return testMapper.getById(id);
	}

}
