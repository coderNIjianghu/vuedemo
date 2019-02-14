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
    /**
     * @Author cui
     * @Description  删除
     * @Date 11:35 2019/2/14 0014
     * @param id
     * @return com.mt.vuedemo.result.Result
     **/
    @GetMapping("/deleteById")
    public Result deleteById( Integer id){
        return articleService.deleteById(id);
    }
    /**
     * @Author cui
     * @Description  添加
     * @Date 11:35 2019/2/14 0014
     * @param article
     * @param bindingResult
     * @return com.mt.vuedemo.result.Result
     **/
    @PostMapping("/addArticle")
    public Result addArticle(@Valid @RequestBody Article article, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            String message = String.format("添加失败，详细信息[%s]。", bindingResult.getFieldError().getDefaultMessage());
            return ResultFactory.buildFailResult(message);
        }
        return articleService.addArticle(article);
    }
    /**
     * @Author cui
     * @Description 根据id查询
     * @Date 11:37 2019/2/14 0014
     * @param id
     * @return com.mt.vuedemo.result.Result
     **/
    @GetMapping("/getArticleById")
    public Result getArticleById(Integer id){
        return articleService.getArticleById(id);
    }
    /**
     * @Author cui
     * @Description  修改
     * @Date 11:55 2019/2/14 0014 
     * @param article
     * @param bindingResult
     * @return com.mt.vuedemo.result.Result
     **/
    @PostMapping("/updateArticle")
    public Result updateArticle(@Valid @RequestBody Article article, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            String message = String.format("修改失败，详细信息[%s]。", bindingResult.getFieldError().getDefaultMessage());
            return ResultFactory.buildFailResult(message);
        }
        return articleService.updateArticle(article);
    }
}
