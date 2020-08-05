package com.laughing.danmaku.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/4 12:50
 */
@Slf4j
@Controller
public class IndexController {
    @RequestMapping("/danmu")
    private String index(){
        log.info(new Date()+"访问index");
        return "danmu";
    }
}
