package com.team.address;

import com.team.address.mapper.AddressMapper;
import com.team.address.vo.AddressVo;
import com.team.address.vo.CustomAddress;
import com.team.facade.pojo.Address;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.junit4.SpringRunner;
import org.xml.sax.InputSource;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = AddressStrat.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AddressMapperTest {
    @Autowired
    private AddressMapper mapper;
    @Autowired
    private DataSource dataSource;

    @Test
    public void testgetAll() throws Exception{
        backoneTable();
        insert();

        CustomAddress customAddress = new CustomAddress();
        customAddress.setAddressId(1);
        customAddress.setPhone("cxcxc");

        AddressVo addressVo = new AddressVo();
        addressVo.setCustomAddress(customAddress);

        List<Address> all = mapper.getAll(addressVo);
        for (Address address:all) {
            Assert.assertEquals(address,address);
        }

        recoveTable();
    }
    @Test
    public void testAdd(){
        Address address = new Address(null, "qin",
                "cd", "yidan", "123",
                "456", "qq.com", "niu", "11:11", "1234", 1);
        int state = mapper.add(address);
        System.out.println(state);
    }
    @Test
    public void testUpdate(){
        Address address = new Address();
        address.setBestDeliverTime("23:43");
        address.setAddressId(3);

        int state = mapper.update(address);
        System.out.println(state);
    }
    @Test
    public void testDeleteById(){
        Address address = new Address();
        address.setAddressId(4);
        mapper.deleteById(address);
    }


    /**
     * @param: []
     * @return: void
     * @auther: qin
     * @date: 2018/11/21
     * @Description:备份一张表的数据
     **/
    public void backoneTable() throws Exception{
        QueryDataSet queryDataSet = new QueryDataSet(new DatabaseConnection(dataSource.getConnection()));
        queryDataSet.addTable("address");
        FlatXmlDataSet.write(queryDataSet,new FileOutputStream(new File("D:\\yuan.xml")));

    }
    /**
     * @param: []
     * @return: void
     * @auther: qin
     * @date: 2018/11/21
     * @Description:清空表数据，插入新的数据
     **/
    @Test
    public void insert() throws Exception{
        FlatXmlDataSet dataSet=new FlatXmlDataSet(new InputSource("abc.xml"));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()),dataSet);
    }
    /**
     * @param: []
     * @return: void
     * @auther: qin
     * @date: 2018/11/21
     * @Description:恢复数据
     **/
    public void recoveTable() throws Exception{
        FlatXmlDataSet dataSet=new FlatXmlDataSet(new InputSource(new FileInputStream(new File("D:\\yuan.xml"))));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()),dataSet);
    }

}
