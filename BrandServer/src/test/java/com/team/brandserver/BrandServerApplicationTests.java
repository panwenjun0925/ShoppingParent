package com.team.brandserver;

import com.team.brandserver.mapper.BrandMapper;
import com.team.brandserver.vo.BrandVo;
import com.team.brandserver.vo.ConstomBrand;
import com.team.facade.pojo.Brand;
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
@SpringBootTest(classes= BrandServerApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class BrandServerApplicationTests {

    @Autowired
    BrandMapper brandMapper;
    @Autowired
    DataSource dataSource;

    @Test
    public void blackTable() throws Exception{
        QueryDataSet dataSet = new QueryDataSet(new DatabaseConnection(dataSource.getConnection()));
        dataSet.addTable("brand");
        FlatXmlDataSet.write(dataSet,new FileOutputStream(new File("F:\\brand.xml")));
    }

    @Test
    public  void insertData() throws  Exception{

        FlatXmlDataSet dataSet=new FlatXmlDataSet(new InputSource("brand1.xml"));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()), dataSet);
    }

    @Test
    public void resumeTable() throws  Exception{
        IDataSet dataSet=new FlatXmlDataSet(new InputSource(new FileInputStream(new File("F:\\brand.xml"))));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()), dataSet);
    }

    @Test
    public void  getByIdTest() throws Exception{
        blackTable();
        insertData();
        ConstomBrand constomBrand = new ConstomBrand();
        constomBrand.setBrandId(2);
        BrandVo brandVo = new BrandVo();
        brandVo.setConstomBrand(constomBrand);
        List<Brand> list = brandMapper.findBy(brandVo);

        Assert.assertEquals("香奈儿",list.get(0).getBrandName());
        Assert.assertEquals("654",list.get(0).getBrandLog());
        resumeTable();
    }
}
