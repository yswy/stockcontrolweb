/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.bench.app.asdisplay.web.json;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bench.app.asdisplay.core.model.JsonOutputResult;

/**
 * 检查是否有新的视频
 * 
 * @author zuoer
 *
 * @version $Id: CheckHasNewVideoJson.java, v 0.1 2017年10月11日 上午11:02:24 zuoer Exp $
 */
@Controller
public class CheckHasNewVideoJson {
	
	
	/**
	 * 
	 * @param modelMap
	 */
	@RequestMapping(value = "checkHasNewVideo.json", method = {RequestMethod.GET, RequestMethod.POST})
	public void receivingAdminListQuery(ModelMap modelMap){
		JsonOutputResult jsonResult = new JsonOutputResult();
		
		jsonResult.setSuccess(true);
		jsonResult.pushToModel(modelMap);
	}
	
}
