package com.dkt;

import com.dkt.mapper.UserMapper;
import com.dkt.pojo.User;
import com.dkt.utils.MyBatisUtil;
import com.dkt.utils.SqlSessionFactionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: dkt
 * @Pcakage: com.dkt.SqlSessionFactionTest
 * @Date: 2022年11月08日 22:05
 * @Description:
 */
public class SqlSessionFactionTest extends MyBatisUtil {

    @Test
    public void sqlSessionTest(){
        SqlSession sqlSession = SqlSessionFactionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
        SqlSessionFactionUtil.commitAndClose(sqlSession);
    }

    @Test
    public void testMybatisUtil(){
        SqlSession sqlSession = MyBatisUtil.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.findAllUser();
        System.out.println(user);
    }
}
