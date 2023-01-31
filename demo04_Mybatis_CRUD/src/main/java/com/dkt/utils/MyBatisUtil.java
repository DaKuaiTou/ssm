package com.dkt.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: dkt
 * @Pcakage: com.dkt.utils.MyBatisUtil
 * @Date: 2023年01月11日 20:29
 * @Description:
 */
public class MyBatisUtil {
    // 声明SqlSessionFactory
    private static SqlSessionFactory sf;

    //ThreadLocal是线程局部变量对象，保存在该对象中的数据是线程安全的
    private static final ThreadLocal<SqlSession> tl = new ThreadLocal<SqlSession>();

    static {
        try {
            InputStream ins = Resources.getResourceAsStream("SqlMapperConfig.xml");
            sf = new SqlSessionFactoryBuilder().build(ins);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //添加获取SqlSession方法
    public static SqlSession openSession() {
        //从tl对象中获取sqlSession对象
        SqlSession sqlSession = tl.get();
        if (sqlSession == null) {
            //通过sqlSessionFactory获取sqlSession对象
            sqlSession = sf.openSession();
            //将获取到的sqlSession对象存入tl
            tl.set(sqlSession);
        }
        return sqlSession;
    }

    //添加关闭SqlSession方法
    public static void closeSession() {
        SqlSession sqlSession = openSession();
        sqlSession.close();
        //从tl对象中移除当前的sqlSession对象
        tl.remove();
    }

    //添加返回任意Mapper的方法
    // <T> T :<T>表示该方法的返回值支持泛型 T表示方法的返回值类型可以是任意类型
    //Class<T> clazz表示方法参数是Class类型，<T>表示方法的参数支持泛型
    public static <T> T getMapper(Class<T> clazz) {
        //获取SqlSession
        SqlSession sqlSession = openSession();
        return sqlSession.getMapper(clazz);
    }

    //添加提交事务的方法
    public static void commit() {
        SqlSession sqlSession = openSession();
        //提交事务
        sqlSession.commit();
    }

    //添加回滚事务的方法
    public static void rollback() {
        SqlSession sqlSession = openSession();
        //回滚事务
        sqlSession.rollback();
    }


}
