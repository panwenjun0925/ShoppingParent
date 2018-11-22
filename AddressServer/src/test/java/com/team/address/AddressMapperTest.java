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
        Assert.assertEquals(addressVo.getCustomAddress().getAddressId(),all.get(0).getAddressId());
        recoveTable();
    }
    @Test
    public void testAdd() throws Exception{
        backoneTable();
        insert();
        Address address = new Address(null, "qin",
                "cd", "yidan", "123",
                "456", "qq.com", "niu", "11:11", "1234", 1);
        int state = mapper.add(address);
        Assert.assertEquals(1,state);
        recoveTable();
    }
    @Test
    public void testUpdate() throws Exception{
        backoneTable();
        insert();
        Address address = new Address();
        address.setBestDeliverTime("23:43");
        address.setAddressId(1);
        int state = mapper.update(address);
        Assert.assertEquals(1,state);
        recoveTable();
    }
    @Test
    public void testDeleteById() throws Exception{
        backoneTable();
        insert();
        Address address = new Address();
        address.setAddressId(1);
        int state = mapper.deleteById(address);
        Assert.assertEquals(1,state);
        recoveTable();
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
