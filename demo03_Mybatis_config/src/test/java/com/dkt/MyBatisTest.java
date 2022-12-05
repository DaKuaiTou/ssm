package com.dkt;

import com.dkt.mapper.UserMapper;
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
 * @Date: 2022年11月08日 15:03
 * @Description:
 */
public class MyBatisTest {
    @Test
    public void findAllUser() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sessionFactoryBuilder.build(in);
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }
}
