package com.zc.hust.controller;


import com.zc.hust.pojo.IMoocJSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("err")
public class ErrorController {
    @RequestMapping("/error")
    public String error(){
        int a = 1 / 0;
        return "thymeleaf/error";
    }
    @RequestMapping("/ajaxerror")
    public  String ajaxerror(){
        return "thymeleaf/ajaxerror";

    }

    @RequestMapping("/getAjaxerror")
    @ResponseBody
    public IMoocJSONResult getAjaxerror(){
        int a = 1 / 0;
        //上面抛出异常，进入拦截器
        return IMoocJSONResult.ok();
    }
}
