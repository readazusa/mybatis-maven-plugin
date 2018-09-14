package com.yiwangqingshui.mybatis.gen.test;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Set;

/**
 * 这里写代码描述
 *
 * @author smc
 * @date 2018-09-11 22:19
 * @since
 **/
public class StringRgx {


    @Test
    public void spiltTest(){
        String str = "com.yiwangqingshui.user";

        String newStr = str.replace(".","/");
        System.out.println(newStr);

        Set<String> sets = Sets.newHashSet();

        sets.add("ava.util.Date");
        sets.add("ava.util.Date");

        System.out.println(sets);
    }
}
