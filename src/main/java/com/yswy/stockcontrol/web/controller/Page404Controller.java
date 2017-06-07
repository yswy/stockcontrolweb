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
 * @version $Id: Page404Controller.java, v 0.1 2017年6月7日 下午5:32:31 zuoer Exp $
 */
@Controller
@RequestMapping("/404.htm")
public class Page404Controller {

	@RequestMapping(method = RequestMethod.GET)
	public String doGet(ModelMap model, WebRequest request) {
		model.addAttribute("test", "这是后台传入的");
		return "404.vm";
	}

}
