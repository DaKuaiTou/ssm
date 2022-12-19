import com.dkt.controller.AccountController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: dkt
 * @Pcakage: PACKAGE_NAME.TransactionTest
 * @Date: 2022年12月18日 20:31
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TransactionTest {

    @Autowired
    private AccountController accountController;

    @Test
    public void test01(){
        accountController.transfer("张三","李四",100.0);
    }
}
