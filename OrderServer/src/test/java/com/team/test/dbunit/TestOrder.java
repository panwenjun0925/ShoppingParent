package com.team.test.dbunit;

import com.team.order.AppStart;
import com.team.order.mapper.OrderDesMapper;
import com.team.order.mapper.OrderMapper;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlProducer;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xml.sax.InputSource;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.SQLException;

/**
 * @Auther: PWJ
 * @Date: 2018/11/21 19:26
 * @Description:
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppStart.class)
public class TestOrder {
    @Autowired
    OrderMapper mapper;
    @Autowired
    OrderDesMapper desMapper;

    @Autowired
    DataSource dataSource;

    private DatabaseConnection connection = null;
    private String backXmlName = "orderBackSource.xml";
    private String testXmlName = "ordersSource.xml";

    @Before
    public void init() throws DatabaseUnitException, SQLException {
        //这个里面的参数就是实际上连接数据库的这个参数
        connection = new DatabaseConnection(dataSource.getConnection());
    }

    @Test
    public void testOrder() throws Exception {
        backOneTable("orders");
        cleanAndInsertDate();




        resumeTable();
    }


    /**
     * 备份数据可以指定一张表格的数据
     *
     * @throws
     * @Title: backOneTable
     * @Description: TODO
     * @param: @throws Exception
     * @return: void
     */
    public void backOneTable(String tableName) throws Exception {
        QueryDataSet dataSet = new QueryDataSet(connection);
        dataSet.addTable(tableName);
        FlatXmlDataSet.write(dataSet, new FileOutputStream(new File("D://"+backXmlName)));
    }

    /**
     * 清空并且插入测试表数据
     *
     * @throws
     * @Title: cleanAndInsertDate
     * @Description: TODO
     * @param: @throws Exception
     * @return: void
     */
    public void cleanAndInsertDate() throws Exception {
//        IDataSet dataSet = new FlatXmlDataSet(new FlatXmlProducer(new InputSource(TestOrder.class.getClassLoader().getResourceAsStream(testXmlName))));
        IDataSet dataSet = new FlatXmlDataSet(new InputSource(TestOrder.class.getClassLoader().getResourceAsStream(testXmlName)));
        DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
    }

    /**
     * 恢复数据库数据
     *
     * @throws
     * @Title: resumeTable
     * @Description: TODO
     * @param: @throws Exception
     * @return: void
     */
    public void resumeTable() throws Exception {
        IDataSet ds = new FlatXmlDataSet(new FlatXmlProducer(new InputSource(new FileInputStream("D://"+backXmlName))));
        DatabaseOperation.CLEAN_INSERT.execute(connection, ds);
    }

}
