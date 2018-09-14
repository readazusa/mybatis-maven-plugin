package com.yiwangqingshui.mybatis.gen.template;

import java.util.List;

/**
 * 这里写文档描述
 * @author smc
 * @date 2018-09-12 10:33
 * @since
 */
public interface DOMapper {


    public int add(Object obj);

    public int updateById();

    public int updateByUid();

    public int deleteById();

    public int deleteByUid();

    public int queryTotal(Object obj);

    public List<Object> queryList(Object obj);

    public List<Object> queryAll();







}
