package com.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author：linma
 * @date: 2018/12/21 11:19
 * @email: linma@homeinns.com
 **/
@tk.mybatis.mapper.annotation.RegisterMapper
public interface HomeinnsDao<T> extends Mapper<T>, MySqlMapper<T> {
}
