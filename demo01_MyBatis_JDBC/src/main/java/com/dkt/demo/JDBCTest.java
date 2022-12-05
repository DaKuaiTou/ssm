package com.dkt.demo;

import java.sql.*;

/**
 * @author: dkt
 * @Pcakage: com.dkt.demo.JDBCTest
 * @Date: 2022年11月07日 13:52
 * @Description:
 */
public class JDBCTest {
    public static void main(String[] args) {
        /*
        *   1.注册驱动
        *   2.获取连接
        *   3.创建预编译SQL语句对象
        *   4.设置参数，进行增删改查
        *   5.结果集的处理
        *   6.释放资源
        * */
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "rootroot");
            // 创建预编译SQL语句对象
            preparedStatement = connection.prepareStatement("select * from user where username=?");
            preparedStatement.setString(1,"张无");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+","+resultSet.getString("username"));
            }
            // 设置参数
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
