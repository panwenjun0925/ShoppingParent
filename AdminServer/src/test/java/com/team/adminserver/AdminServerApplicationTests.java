package com.team.adminserver;

import com.team.adminserver.mapper.AdminMapper;
import com.team.facade.pojo.Admin;
import com.team.facade.vo.AdminVo.AdminVo;
import com.team.facade.vo.AdminVo.ConstomAdmin;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;
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
@SpringBootTest(classes= AdminServerApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class AdminServerApplicationTests {

    @Autowired
    AdminMapper adminMapper;
    @Autowired
    DataSource dataSource;

    @Test
    public void backTable() throws Exception{
        QueryDataSet dataSet = new QueryDataSet(new DatabaseConnection(dataSource.getConnection()));
        dataSet.addTable("admin");
        FlatXmlDataSet.write(dataSet,new FileOutputStream(new File("F:\\admin.xml")));
    }

    @Test
    public  void insertData() throws  Exception{

        FlatXmlDataSet dataSet=new FlatXmlDataSet(new InputSource("admin1.xml"));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()), dataSet);
    }

    @Test
    public void resumeTable() throws  Exception{
        IDataSet dataSet=new FlatXmlDataSet(new InputSource(new FileInputStream(new File("F:\\admin.xml"))));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()), dataSet);
    }

    @Test
    public void  getByIdTest() throws Exception{
        backTable();
        insertData();
        ConstomAdmin constomAdmin = new ConstomAdmin();
        constomAdmin.setAdminId(2);
        AdminVo adminVo = new AdminVo();
        adminVo.setConstomAdmin(constomAdmin);
        List<Admin> list = adminMapper.findBy(adminVo);

        Assert.assertEquals("覃少1",list.get(0).getAdminName());
        Assert.assertEquals("654",list.get(0).getAdminPassword());
        resumeTable();
    }

}
