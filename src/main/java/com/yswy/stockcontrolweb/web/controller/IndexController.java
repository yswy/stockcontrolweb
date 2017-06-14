/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yswy.stockcontrolweb.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.yswy.stockcontrolweb.dal.dao.UserMapper;
import com.yswy.stockcontrolweb.dal.dateobject.User;
import com.yswy.stockcontrolweb.dal.dateobject.UserExample;

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
	
	@Autowired
	private UserMapper userMapper;

	@RequestMapping(method = RequestMethod.GET)
	public String doGet(ModelMap model, WebRequest request) {
		model.addAttribute("test", "这是后台传入的值");
		testDB(model);
		return "index.vm";
	}

	public void testDB(ModelMap mdelMap) {
		UserExample ss = new UserExample();
		ss.createCriteria().andUserIdEqualTo("1000");
		List<User> list = userMapper.selectByExample(ss);
		mdelMap.addAttribute("list", list);
	}
}
