package com.mt.vuedemo.controller;

import com.mt.vuedemo.result.Result;
import com.mt.vuedemo.server.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tian
 * @description 文章控制器
 * @create 2019-02-13 11:12
 */
@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping(value = "/api/getArticleList",produces = "application/json; charset=UTF-8")
    public Result getArticleList(){
        return articleService.getArticleList();
    }
}
