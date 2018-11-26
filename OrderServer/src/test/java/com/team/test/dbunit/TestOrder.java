package com.team.test.dbunit;

import com.team.facade.pojo.Order;
import com.team.order.AppStart;
import com.team.order.mapper.OrderMapper;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlProducer;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Assert;
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
import java.util.List;

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
    DataSource dataSource;

    private DatabaseConnection connection = null;
    private String backXmlName = "orderBackSource.xml";
    private String testXmlName = "ordersSource.xml";
    private Order exOrder = null;

    @Before
    public void init() throws Exception {
       exOrder = new Order(1,"10",2,"2018-09-21 10:50:24","2018.11.20",1,120.0,1,"aa",1,"1",1,"22");
        //这个里面的参数就是实际上连接数据库的这个参数
        connection = new DatabaseConnection(dataSource.getConnection());
        backOneTable("orders");
        cleanAndInsertDate();
    }

    @Test
    public void testGetOrderByCondition() throws Exception {
        Order order = new Order();
        List<Order> orderList = mapper.getOrderByCondition(order);
        for (Order order1 : orderList) {
            Assert.assertEquals(exOrder.getOrderId(),order1.getOrderId());
        }
    }
    @Test
    public void testAddOrder() throws Exception {
        int i = mapper.addOrder(exOrder);
        Assert.assertEquals(1,i);
    }

    @Test
    public void testDelOrderByIf() throws Exception {
        int i = mapper.delOrderByOrderId(1);
        Assert.assertEquals(1,i);
    }

    @Test
    public void testUpdateOrder() throws Exception {
        int i = mapper.updateOrder(exOrder);
        Assert.assertEquals(1,i);
    }

    @After
    public void after() throws Exception {
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
