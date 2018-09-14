package com.yiwangqingshui.mybatis.gen.test;


import com.yiwangqingshui.mybatis.gen.model.dbtable.Column;

import oracle.jdbc.OracleDatabaseMetaData;
import org.junit.Test;

import java.sql.*;

/**
 * 这里写文档描述
 *
 * @author smc
 * @date 2018-09-11 17:01
 * @since
 */
public class DbMetedataTest {

    @Test
    public void indexUniqueTest() throws Exception {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/oauth", "root", "lovety");
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSet resultSet = databaseMetaData.getIndexInfo(null,null,"test",true,false);
        while (resultSet.next()){

            String indexName = resultSet.getString("INDEX_NAME");

            String columnName = resultSet.getString("COLUMN_NAME");

            String type = resultSet.getString("TYPE");

            System.out.println("indexName: "+ indexName+" ,columnName: "+ columnName+" ,type: "+ type);
        }
    }

    @Test
    public void primaryKeyTest() throws Exception {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/oauth", "root", "lovety");

        DatabaseMetaData databaseMetaData = connection.getMetaData();

        ResultSet resultSet =  connection.getMetaData().getPrimaryKeys(null,null,"test");


        while (resultSet.next()){

            String columnName = resultSet.getString("COLUMN_NAME");

            String KEY_SEQ = resultSet.getString("KEY_SEQ");

            String PK_NAME = resultSet.getString("PK_NAME");

//            int dataType = resultSet.getInt("DATA_TYPE");
            System.out.println("columnName: "+ columnName+" ,KEY_SEQ: "+ KEY_SEQ+" ,PK_NAME: "+ PK_NAME+",datatype: ");

        }

    }

    @Test
    public void columnTest() throws Exception {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/oauth", "root", "lovety");

        DatabaseMetaData databaseMetaData = connection.getMetaData();

        ResultSet resultSet = databaseMetaData.getColumns(null, null, "test", null);
        while (resultSet.next()) {
            Column column = new Column();
//            String columName = resultSet.getString("COLUMN");
//            column.setColumnName(columName);
//            column.setJavaName(CamelCaseUtils.toCamelCase(columName.toUpperCase()));
            int dataType = resultSet.getInt("DATA_TYPE");
            System.out.println("in: "+ dataType);
            JDBCType jdbcType = JDBCType.valueOf(dataType);
            System.out.println("datype: " + jdbcType.getName());
        }
    }



    @Test
    public void getTableTest() throws SQLException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/oauth", "root", "lovety");

        DatabaseMetaData databaseMetaData = connection.getMetaData();

        ResultSet resultSet = databaseMetaData.getTables(null,null,null,null);

        while (resultSet.next()){
            String tableName = resultSet.getString("TABLE_NAME");
            String remark = resultSet.getString("REMARKS");

            System.out.println("tableName: "+ tableName+" ,remark: "+ remark);
        }
        System.out.println("2222");
    }

    @Test
    public void getOracleTableTest() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "scott");
        PreparedStatement preparedStatement =connection.prepareStatement("select * from  user_tab_comments where table_name = 'TEST'");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String tableName = resultSet.getString("TABLE_NAME");
            String remark = resultSet.getString("COMMENTS");
            System.out.println("tableName: "+ tableName+" ,remark: "+ remark);
        }

    }


    @Test
    public void columnOracleTest() throws Exception {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "scott");

        DatabaseMetaData databaseMetaData = connection.getMetaData();

        ResultSet resultSet = databaseMetaData.getColumns(null, null, "TEST", null);
        while (resultSet.next()) {
            Column column = new Column();
            String columName = resultSet.getString("COLUMN_NAME");
//            column.setColumnName(columName);
//            column.setJavaName(CamelCaseUtils.toCamelCase(columName.toUpperCase()));
            int dataType = resultSet.getInt("DATA_TYPE");
            System.out.println("colUMN: "+ columName+" ,dataType: "+ dataType);
            System.out.println("in: "+ dataType);
            JDBCType jdbcType = JDBCType.valueOf(dataType);
            System.out.println("datype: " + jdbcType.getName());
        }
    }


    @Test
    public void primaryKeyOracleTest() throws Exception {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "scott");

        DatabaseMetaData databaseMetaData = connection.getMetaData();

        ResultSet resultSet =  connection.getMetaData().getPrimaryKeys(null,null,"TEST");

        while (resultSet.next()){

            String columnName = resultSet.getString("COLUMN_NAME");

            String KEY_SEQ = resultSet.getString("KEY_SEQ");

            String PK_NAME = resultSet.getString("PK_NAME");

//            int dataType = resultSet.getInt("DATA_TYPE");
            System.out.println("columnName: "+ columnName+" ,KEY_SEQ: "+ KEY_SEQ+" ,PK_NAME: "+ PK_NAME+",datatype: ");

        }

    }


    @Test
    public void indexOracleUniqueTest() throws Exception {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "scott");
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSet resultSet = databaseMetaData.getIndexInfo(null,null,"TEST",true,false);
        while (resultSet.next()){

            String indexName = resultSet.getString("INDEX_NAME");

            String columnName = resultSet.getString("COLUMN_NAME");

            String type = resultSet.getString("TYPE");

            System.out.println("indexName: "+ indexName+" ,columnName: "+ columnName+" ,type: "+ type);
        }
    }

}
