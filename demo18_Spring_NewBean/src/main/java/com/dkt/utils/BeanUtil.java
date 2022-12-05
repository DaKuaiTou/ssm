package com.dkt.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author: dkt
 * @Pcakage: com.dkt.utils.BeanUtil
 * @Date: 2022年11月24日 21:52
 * @Description:
 */
public class BeanUtil {
    private static DataSource dataSource;

    static {
        InputStream inputStream = null;
        try {
            inputStream = BeanUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();
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
