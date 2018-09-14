package com.yiwangqingshui.mybatis.gen.test;

import org.junit.Test;

/**
 * 这里写文档描述
 *
 * @author smc
 * @date 2018-09-11 18:07
 * @since
 */
public class PrefixTest {


    @Test
    public void contentPrefixTest(){
        String tableName = "t_123_nam";

        String newTableName = tableName.substring(2);

        System.out.println("new: "+ newTableName);



    }


    @Test
    public void contentJq(){

        String ds = "java.util.Date";

        String nds ="String";


        System.out.println("nds: "+ ds.substring(ds.lastIndexOf(".")+1));

        System.out.println("nnds: "+ nds.substring(nds.lastIndexOf(".")+1));


    }

}
