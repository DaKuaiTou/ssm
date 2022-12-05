package com.dkt.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: dkt
 * @Pcakage: com.dkt.utils.SqlSessionFaction
 * @Date: 2022年11月08日 21:56
 * @Description:
 */
public class SqlSessionFactionUtil {
    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获取sqlsession
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

    // 事务提交和关闭
    public static void commitAndClose(SqlSession sqlSession){
        sqlSession.commit();
        sqlSession.close();
    }

    // 回滚和关闭资源
    public static void rollbackAndClose(SqlSession sqlSession){
        sqlSession.commit();
        sqlSession.close();
    }
}
