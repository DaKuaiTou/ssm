package com.dkt;

import com.dkt.entity.Member;
import com.dkt.mapper.MemberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: dkt
 * @Pcakage: com.dkt.TestGerator
 * @Date: 2023年01月10日 20:36
 * @Description:
 */
public class TestGerator {

    @Test
    public void test1() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        Member member = memberMapper.selectByPrimaryKey(1);
        System.out.println(member);
    }
}
