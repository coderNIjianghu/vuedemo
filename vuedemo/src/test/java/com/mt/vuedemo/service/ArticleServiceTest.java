package com.mt.vuedemo.service;

import com.mt.vuedemo.bean.Article;
import com.mt.vuedemo.bean.ArticleExample;
import com.mt.vuedemo.dao.ArticleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author tian
 * @description
 * @create 2019-02-13 11:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceTest {
    @Autowired
    private ArticleMapper articleMapper;
    @Test
    public void getListTest(){
        ArticleExample example = new ArticleExample();
        example.createCriteria().andIdIsNotNull();
        List<Article> articles = articleMapper.selectByExample(example);
        articles.forEach(a->{
            System.out.println(a.getId());
        });
    }
}
