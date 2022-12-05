package com.dkt.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import jdk.internal.util.xml.impl.Input;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author: dkt
 * @Pcakage: com.dkt.utils.DruidUtil
 * @Date: 2022年12月01日 15:39
 * @Description:
 */
public class DruidUtil {
    private static DataSource dataSource = null;
    static {
        InputStream inputStream = null;
        try {
            Properties properties = new Properties();
            inputStream = DruidUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(inputStream);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}
