/**
 * 
 */
package com.nfi.ndms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Leucippus
 * @since 2017 08 25 19:39:31 Friday
 * @version 
 */
@Controller
public class FirstController {
	
	@RequestMapping("hello")
	public String firstController(Model model) {
		return "index";
	}

}
