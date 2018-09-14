package com.yiwangqingshui.mybatis.gen.template;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


/**
 *  dao
 */
@Repository
public class DAO {

    @Resource
    private DOMapper doMapper;

    public int test(){
        return doMapper.add(null);
    }





}
