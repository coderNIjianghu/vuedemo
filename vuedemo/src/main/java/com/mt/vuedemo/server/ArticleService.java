package com.mt.vuedemo.server;

import com.mt.vuedemo.bean.Article;
import com.mt.vuedemo.bean.ArticleExample;
import com.mt.vuedemo.config.ResultFactory;
import com.mt.vuedemo.dao.ArticleMapper;
import com.mt.vuedemo.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tian
 * @description 文章服务
 * @create 2019-02-13 11:15
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    public Result getArticleList() {
        ArticleExample example = new ArticleExample();
        example.createCriteria().andIdIsNotNull();
        List<Article> articles = articleMapper.selectByExample(example);
        articles.forEach(a->{
            System.out.println(a.getArticlename());
        });
        return ResultFactory.buildSuccessResult(articles);
    }
}
