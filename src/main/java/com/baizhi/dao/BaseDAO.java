package com.baizhi.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Fy_
 * @date 2020/6/3 14:52
 */
public interface BaseDAO<T> {
    void save(T t);
    void update(T t);
    void delete(String id);
    T findById(String id);
    List<T> findAll();
    Long findTotalCounts();
    //参数一 起始条数 参数二每页显示记录数
    List<T> findByPage(@Param("start") Integer start, @Param("size")Integer size);


}
