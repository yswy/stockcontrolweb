/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yswy.stockcontrol.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

/**
 * 
 * 
 * @author zuoer
 *
 * @version $Id: IndexController.java, v 0.1 2017年6月6日 下午2:15:43 zuoer Exp $
 */
@Controller
@RequestMapping("/index.htm")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String doGet(ModelMap model, WebRequest request) {
		model.addAttribute("test", "这是后台传入的值");
		return "index.vm";
	}

}
