package com.mt.vuedemo.controller;

import com.mt.vuedemo.bean.Article;
import com.mt.vuedemo.config.ResultFactory;
import com.mt.vuedemo.result.Result;
import com.mt.vuedemo.server.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author tian
 * @description 文章控制器
 * @create 2019-02-13 11:12
 */
@RestController
@RequestMapping("/api")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    /**
     * @Author cui
     * @Description  查看全部
     * @Date 09:04 2019/2/14 0014
     * @param
     * @return com.mt.vuedemo.result.Result
     **/
    @PostMapping("/getArticleList")
    public Result getArticleList(){
        return articleService.getArticleList();
    }
    @GetMapping("/deleteById")
    public Result deleteById( Integer id){
        return articleService.deleteById(id);
    }
    @PostMapping("/addArticle")
    public Result addArticle(@Valid @RequestBody Article article, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            String message = String.format("添加失败，详细信息[%s]。", bindingResult.getFieldError().getDefaultMessage());
            return ResultFactory.buildFailResult(message);
        }
        return articleService.addArticle(article);
    }
}
