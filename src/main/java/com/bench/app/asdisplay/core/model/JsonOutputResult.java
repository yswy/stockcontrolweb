package com.bench.app.asdisplay.core.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.ui.ModelMap;

/**
 * JSON输出结果
 * 
 * @author chenbug
 * 
 * @version $Id: JsonOutputResult.java, v 0.1 2014-4-25 下午2:27:31 chenbug Exp $
 */
public class JsonOutputResult{

	/**
	 * 是否成功
	 */
	private boolean success;

	/**
	 * 错误
	 */
	private ErrorEntry error;

	/**
	 * 详细信息
	 */
	private String detailMessage;

	/**
	 * 其他输出属性
	 */
	private Map<String, Object> outputParameters = new HashMap<String, Object>();


	/**
	 * 将结果集合push到modelMap
	 * 
	 * @param model
	 */
	public void pushToModel(ModelMap model) {
		model.addAttribute("success", this.success);
		model.addAttribute("error", this.error);
		model.addAttribute("detailMessage", this.detailMessage);
		model.addAttribute("outputParameters", this.outputParameters);
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ErrorEntry getError() {
		return error;
	}

	public void setError(ErrorEntry error) {
		this.error = error;
	}

	public Map<String, Object> getOutputParameters() {
		return outputParameters;
	}

	public void setOutputParameters(Map<String, Object> outputParameters) {
		this.outputParameters = outputParameters;
	}

	public void setOutputParameter(String key, Object value) {
		this.outputParameters.put(key, value);
	}

	public String getDetailMessage() {
		return detailMessage;
	}

	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}
}
