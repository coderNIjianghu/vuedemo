package com.mt.vuedemo.server;

import com.mt.vuedemo.bean.Article;
import com.mt.vuedemo.bean.ArticleExample;
import com.mt.vuedemo.config.ResultFactory;
import com.mt.vuedemo.dao.ArticleMapper;
import com.mt.vuedemo.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
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
        return ResultFactory.buildSuccessResult(articleMapper.selectByExample(example));
    }

    public Result deleteById(Integer id) {
        Assert.notNull(id,"id为空");
        int i = articleMapper.deleteByPrimaryKey(id);
        return commonResult(i,"删除");
    }

    public Result addArticle(Article article) {
        article.setCreatetime(new Date());
        int i = articleMapper.insertSelective(article);
        return commonResult(i,"添加");
    }

    public Result commonResult(int i,String msg){
        if (i==1){
            return ResultFactory.buildSuccessResult(msg+"成功");
        }else {
            return ResultFactory.buildSuccessResult(msg+"失败");
        }
    }

    public Result getArticleById(Integer id) {
        Assert.notNull(id,"id为空");
        return ResultFactory.buildSuccessResult( articleMapper.selectByPrimaryKey(id));

    }
}
