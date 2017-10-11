/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yswy.stockcontrolweb.dal;

import java.util.List;

/**
 * 
 * @author zuoer
 *
 * @version $Id: BaseDao.java, v 0.1 2017年6月23日 下午5:19:48 zuoer Exp $
 */
public interface  BaseDao<T> {

	public T selectByPrimaryKey(Integer id);  
	  
    public int deleteByPrimaryKey(Integer id);  
  
    public int insertSelective(T t);  
  
    public int updateByPrimaryKeySelective(T t);  
  
    public List<T> getList(T t);  
  
    // 获取数量  
    public int getCountSelective(T t);  
  
}
