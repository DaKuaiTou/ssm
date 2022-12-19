import com.dkt.dao.UserDao;
import com.dkt.dao.impl.UserDaoImpl;
import com.dkt.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author: dkt
 * @Pcakage: PACKAGE_NAME.DataSourceTest
 * @Date: 2022年12月14日 11:54
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class DataSourceTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void c3p0Test(){
        List<User> user = userDao.findUser();
        System.out.println(user);
    }
}
