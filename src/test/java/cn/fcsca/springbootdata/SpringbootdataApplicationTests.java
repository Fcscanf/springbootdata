package cn.fcsca.springbootdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.activation.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdataApplicationTests {

    @Autowired
    javax.sql.DataSource source;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println("数据源：" + source.getClass());
        Connection connection = source.getConnection();
        System.out.println("连接：" + connection);
        connection.close();
    }

}
