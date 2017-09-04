/**
 * 
 */
package com.nfi.ndms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Leucippus
 * @since 2017 09 01 15:27:59 Friday
 * @version 
 */
@Controller
public class Templ {

	/**
	 * 
	 */
	public Templ() {
		
	}
	
	@RequestMapping("templ")
	public String goToTemplate() {
		
		return "template";
	}
	
	@RequestMapping("templH")
	public String goToTemplateH() {
		return "templateH";
	}

}
