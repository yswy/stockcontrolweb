/*
 * Bench Inc.
 * Copyright (c) 2004 All Rights Reserved.
 */
package com.bench.app.asdisplay.common.dal.daointerface;



// auto generated imports
//dao imports
import com.bench.app.asdisplay.common.dal.dataobject.UserDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

//do imports

import java.util.Map;

/**
 * A dao interface provides methods to access database table <tt>user</tt>.
 *
 * This file is generated by <tt>bench-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>bench</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/user.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>bench-gen-dal</tt> 
 * to generate this file.
 *
 * @author chenbug
 */
public interface UserDAO  {
	/**
	 *  Insert one <tt>UserDO</tt> object to DB table <tt>user</tt>, return primary key
	 *
	 *  <p>
	 *  	 *  The sql statement for this operation is <br>
	 *  <tt>insert into user(id,user_id,user_name) values (?, ?, ?)</tt>
	 *
	 *	@param user
	 *	@return String
	 *	@throws DataAccessException
	 */	 
    public String insert(UserDO user) throws DataAccessException;

	/**
	 *  Query DB table <tt>user</tt> for records.
	 *
	 *  <p>
	 *  	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, user_name from user</tt>
	 *
	 *	@return List<UserDO>
	 *	@throws DataAccessException
	 */	 
    public List<UserDO> selectAll() throws DataAccessException;

	/**
	 *  Query DB table <tt>user</tt> for records.
	 *
	 *  <p>
	 *  	 *  The sql statement for this operation is <br>
	 *  <tt>select id, user_id, user_name from user where (user_id = ?)</tt>
	 *
	 *	@param userId
	 *	@return UserDO
	 *	@throws DataAccessException
	 */	 
    public UserDO selectByUserId(String userId) throws DataAccessException;

}