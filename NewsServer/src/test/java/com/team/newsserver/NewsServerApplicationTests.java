package com.team.newsserver;

import com.team.facade.pojo.News;
import com.team.newsserver.mapper.NewsMapper;
import com.team.newsserver.vo.ConstomNews;
import com.team.newsserver.vo.NewsVo;
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
@SpringBootTest(classes= NewsStart.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NewsServerApplicationTests {

    @Autowired
    NewsMapper newsMapper;
    @Autowired
    DataSource dataSource;


        @Test
        public void blackTable() throws Exception{
            QueryDataSet dataSet = new QueryDataSet(new DatabaseConnection(dataSource.getConnection()));
            dataSet.addTable("news");
            FlatXmlDataSet.write(dataSet,new FileOutputStream(new File("F:\\news.xml")));
        }

        @Test
        public  void insertData() throws  Exception{

            FlatXmlDataSet dataSet=new FlatXmlDataSet(new InputSource("news1.xml"));
            DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()), dataSet);
        }

        @Test
        public void resumeTable() throws  Exception{
            IDataSet dataSet=new FlatXmlDataSet(new InputSource(new FileInputStream(new File("F:\\news.xml"))));
            DatabaseOperation.CLEAN_INSERT.execute(new DatabaseConnection(dataSource.getConnection()), dataSet);
        }

        @Test
        public void  getByIdTest() throws Exception{
            blackTable();
            insertData();
            ConstomNews constomNews = new ConstomNews();
            constomNews.setNewsId(2);
            NewsVo newsVo = new NewsVo();
            newsVo.setConstomNews(constomNews);
            List<News> list = newsMapper.findBy(newsVo);
            Assert.assertEquals("屁",list.get(0).getNewsTitle());
            Assert.assertEquals("999",list.get(0).getNewsDes());
            resumeTable();
        }

}
