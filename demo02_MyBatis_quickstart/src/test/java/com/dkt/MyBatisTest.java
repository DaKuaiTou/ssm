package com.dkt;

import com.dkt.dao.UserDao;
import com.dkt.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.MyBatisTest
 * @Date: 2022年11月07日 14:53
 * @Description:
 */
public class MyBatisTest {
    @Test
    public void findAllUser() throws IOException {
        /*
        *   步骤：
        *       1.让程序运行的时候去加载mybatis核心配置文件
        *           -配置了连接数据库的信息
        *           -加载了映射文件，JDBC
        *       2.mybatis的核心对象是SqlSessionFaction,如果要使用mybatis的话，就必须要拿到SqlSessionFaction对象
        *       3.如果想要获取核心对象，那么还需要准备一个核心配置文件，那么我们可以使用SqlSessionFaction对象来创建
        * */

        // 1.将SqlMapperConfig.xml配置文件转换为字节输入流
        InputStream inputStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        // 2.根据获得核心配置文件的输入流，来创建SqlSessionFactionBuild对象
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        // 3.使用builder对象去加载字节输入流对象
        SqlSessionFactory sqlSessionFactory = factoryBuilder.build(inputStream);
        // 4.获取mybatis核心配置文件，我们就可以通过核心配置文件，创建SqlSession对象
        // 拿到SqlSession对象之后，就相当于拿到了Connection对象，可以操作Sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        // 调用mapper代理对象的findAllUser方法，进行查询操作
        List<User> userList = mapper.findAllUser();
        for (User user : userList) {
            System.out.println(user);
        }
        // 关闭资源
        sqlSession.close();
        inputStream.close();
    }
}














