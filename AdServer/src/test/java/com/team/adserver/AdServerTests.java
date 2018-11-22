package com.team.adserver;

import com.team.adserver.mapper.AdMapper;
import com.team.adserver.vo.AdVo;
import com.team.adserver.vo.ConstomAd;
import com.team.facade.pojo.Ad;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xml.sax.InputSource;

import javax.sql.DataSource;
import java.io.*;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes= AdServerApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdServerTests {

    @Autowired
    private AdMapper adMapper;
    @Autowired
    private DataSource dataSource;

    @Test
    public void backOneTable() throws Exception {
        QueryDataSet dataSet = new QueryDataSet(new DatabaseConnection(dataSource.getConnection()));
        dataSet.addTable("ad");
        FlatXmlDataSet.write(dataSet,new FileOutputStream(new File("F:\\aaa.xml")));
    }

    @Test
    public  void insertData() throws  Exception{

        FlatXmlDataSet dataSet=new FlatXmlDataSet(new InputSource("data.xml"));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()), dataSet);
    }

    @Test
    public void resumeTable() throws  Exception{
        IDataSet dataSet=new FlatXmlDataSet(new InputSource(new FileInputStream(new File("F:\\aaa.xml"))));
        DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()), dataSet);
    }

    @Test
    public  void  findById() throws Exception {
        backOneTable();
        insertData();
        ConstomAd constomAd = new ConstomAd();
        constomAd.setAdId(2);
        AdVo adVo = new AdVo();
        adVo.setConstomAd(constomAd);
        List<Ad> list = adMapper.findBy(adVo);
        System.out.println(list.get(0));

        resumeTable();
    }

    @Test
    public void delete() throws Exception{
        backOneTable();
        insertData();

        adMapper.delete(3);

        resumeTable();
    }

    @Test
    public  void  update() throws Exception{
//        backOneTable();
//        insertData();
//        Ad ad = new Ad();
//        ad.setAdDes("米酒广告");
//        ad.setAdId(2);
//        adMapper.update(ad);
        resumeTable();
    }
}

