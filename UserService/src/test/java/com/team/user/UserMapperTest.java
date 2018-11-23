package com.team.user;

import com.team.facade.pojo.User;
import com.team.user.mapper.UserMapper;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xml.sax.InputSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper mapper;
    @Autowired
    private DataSource dataSource;


    @Test
    public void testgetAll() throws Exception{
        backoneTable();
        insert();
        User ecuser = new User();
        ecuser.setUserId(1);
        List<User> all = mapper.getAll(null);
        Assert.assertEquals(ecuser.getUserId(),all.get(0).getUserId());
        recoveTable();
    }

    @Test
    public void testAdd() throws Exception{
        backoneTable();
        insert();
        User user = new User(null, "5555", "杨", "159", "2019", "@sss",
                "789654", "5564", "dsa");
        int state = mapper.add(user);
        Assert.assertEquals(1,state);
        recoveTable();
    }
    @Test
    public void testUpdate() throws Exception{
        backoneTable();
        insert();

        User user = new User();
        user.setUserId(1);
        user.setEmail("12@qq.com");
        int update = mapper.update(user);
        Assert.assertEquals(1,update);
        recoveTable();
    }

    @Test
    public void testDeleteById() throws Exception{
        backoneTable();
        insert();

        User user = new User();
        user.setUserId(1);
        int state = mapper.deleteById(user);
        Assert.assertEquals(1,state);
        recoveTable();
    }



    /**
     * @param: []
     * @return: void
     * @auther: qin
     * @date: 2018/11/22
     * @Description:
     **/
    public void backoneTable() throws Exception{
        QueryDataSet queryDataSet = new QueryDataSet(new DatabaseConnection(dataSource.getConnection()));
        queryDataSet.addTable("user");
        FlatXmlDataSet.write(queryDataSet,new FileOutputStream(new File("D:\\user.xml")));

    }
    /**
     * @param: []
     * @return: void
     * @auther: qin
     * @date: 2018/11/22
     * @Description:
     **/

    public void insert() throws Exception{
        FlatXmlDataSet dataSet=new FlatXmlDataSet(new InputSource("userTest.xml"));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()),dataSet);
    }
    /**
     * @param: []
     * @return: void
     * @auther: qin
     * @date: 2018/11/22
     * @Description:
     **/
    public void recoveTable() throws Exception{
        FlatXmlDataSet dataSet=new FlatXmlDataSet(new InputSource(new FileInputStream(new File("D:\\user.xml"))));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()),dataSet);
    }

}
