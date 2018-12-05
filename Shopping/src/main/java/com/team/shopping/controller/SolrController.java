package com.team.shopping.controller;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Iterator;

/**
 * @Auther: PWJ
 * @Date: 2018/11/28 19:46
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/solr")
public class SolrController {
    @Autowired
    SolrClient solrClient;



    @RequestMapping("/query")
    @ResponseBody
    public String getBeanByCondition() throws IOException, SolrServerException {
        //构建查询条件
        SolrQuery condition = new SolrQuery();
        condition.add("q","goodsAll:*");
        //进行查询
        QueryResponse response = solrClient.query(condition);
        //获取查询结果
        SolrDocumentList results = response.getResults();
        //进行数据遍历
        Iterator<SolrDocument> iterator = results.iterator();
        while (iterator.hasNext()){
            //输出数据
            SolrDocument solrDocument = iterator.next();
            System.out.println("查询出来的数据是："+solrDocument.get("id"));
            System.out.println("查询出来的数据是："+solrDocument.get("goodsName"));
            System.out.println("查询出来的数据是："+solrDocument.get("goodsAttr"));
            System.out.println("-------------------------------------------");
        }
        //提交数据
        solrClient.commit();
        //释放资源
        solrClient.close();
        return "查询成功";
    }
}
