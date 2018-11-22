package com.team.test.dbunit;

import com.team.facade.pojo.OrderDes;
import com.team.order.AppStart;
import com.team.order.mapper.OrderDesMapper;
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
public class TestOrderDes {

    @Autowired
    OrderDesMapper desMapper;

    @Autowired
    DataSource dataSource;

    private DatabaseConnection connection = null;
    private String backXmlName = "orderDesBackSource.xml";
    private String testXmlName = "orderDesSource.xml";
    private OrderDes exOrderDes = null;

    @Before
    public void init() throws Exception {
        exOrderDes = new OrderDes(1,10,"2018001",1,1);
        //这个里面的参数就是实际上连接数据库的这个参数
        connection = new DatabaseConnection(dataSource.getConnection());
        backOneTable("orderDes");
        cleanAndInsertDate();
    }

    @Test
    public void testGetOrderDesByCondition() throws Exception {
        OrderDes orderDes = new OrderDes();
        List<OrderDes> desList = desMapper.getOrderDesByConditon(orderDes);
        for (OrderDes des : desList) {
            System.out.println(des);
        }
    }
    @Test
    public void testAddOrderDes() throws Exception {
        int i = desMapper.addOrderDes(exOrderDes);
        Assert.assertEquals(1,i);
    }

    @Test
    public void testDelOrderDes() throws Exception {
        int i = desMapper.delOrderDesByDesId(1);
        Assert.assertEquals(1,1);
    }

    @Test
    public void testUpdateOrderDes() throws Exception {
        int i = desMapper.updateOrderDes(exOrderDes);
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
        IDataSet dataSet = new FlatXmlDataSet(new InputSource(TestOrderDes.class.getClassLoader().getResourceAsStream(testXmlName)));
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
