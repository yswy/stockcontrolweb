package com.yswy.stockcontrolweb.dal.dao;

import com.yswy.stockcontrolweb.dal.dateobject.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}