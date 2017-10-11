/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.yswy.stockcontrolweb.dal;

import java.io.Serializable;

/**
 * 
 * @author zuoer
 *
 * @version $Id: BaseEntity.java, v 0.1 2017年6月23日 下午5:20:02 zuoer Exp $
 */
public abstract class BaseEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 5689299421783808535L;
	private Integer id;  
  
    public Integer getId() {  
        return id;  
    }  
  
    public void setId(Integer id) {  
        this.id = id;  
    }  
}
