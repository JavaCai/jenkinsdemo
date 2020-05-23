package com.javaczh.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description
 * @Author CaiZiHao
 * @Date 2020/5/19 20:53
 * @Version 1.0
 */
@RestController
public class IndexController {
    @GetMapping("/hello")
    public String hello() {
        return "部署成功";
    }

}
