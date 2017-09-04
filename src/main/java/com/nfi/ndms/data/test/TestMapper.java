/**
 * 
 */
package com.nfi.ndms.data.test;

import org.mybatis.spring.annotation.MapperScan;

import com.nfi.ndms.beans.test.Test;

/**
 * @author Leucippus
 * @since 2017 08 29 12:50:29 Tuesday
 * @version 
 */
@MapperScan
public interface TestMapper {
	Test getById(int id);
}
