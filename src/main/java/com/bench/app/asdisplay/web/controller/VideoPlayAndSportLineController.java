/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.bench.app.asdisplay.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

/**
 * 
 * 视频播放和运动曲线页面
 * @author zuoer
 *
 * @version $Id: ErrorController.java, v 0.1 2017年6月7日 下午5:31:21 zuoer Exp $
 */
@Controller
@RequestMapping("/videoPlayAndSportLine.htm")
public class VideoPlayAndSportLineController {

	@RequestMapping(method = RequestMethod.GET)
	public String doGet(ModelMap model, WebRequest request) {
		model.addAttribute("test", "这是后台传入的");
		return "videoPlayAndSportLine.vm";
	}

}
