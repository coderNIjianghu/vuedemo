package com.mt.vuedemo.config;

import com.mt.vuedemo.bean.ResultCode;
import com.mt.vuedemo.result.Result;

/**
 * @author tian
 * @description 返回结构处理生成工厂
 * @create 2019-02-12 15:40
 */
public class ResultFactory {
    public static Result buildSuccessResult(Object data){
        return buildResult(ResultCode.SUCCESS,"成功",data);
    }
    public static Result buildFailResult(String message){
        return buildResult(ResultCode.FAIL,message,null);
    }
    public static Result buildResult(ResultCode resultCode,String message,Object data){
        return buildResult(resultCode.code,message,data);
    }
    public static Result buildResult(int resultCode,String message,Object data){
        return new Result(resultCode,message,data);
    }
}
