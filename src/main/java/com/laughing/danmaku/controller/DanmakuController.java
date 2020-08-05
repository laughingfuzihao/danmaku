package com.laughing.danmaku.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.laughing.danmaku.mapper.DammakuMapper;
import io.netty.util.internal.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.laughing.danmaku.dao.Danmaku;

import java.util.Date;
import java.util.List;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/4 9:09
 */
@RestController
@Slf4j
@RequestMapping("/danmaku")
public class DanmakuController {
    @Autowired
    private DammakuMapper dammakuMapper;
    @Autowired
    private Danmaku danmakudao;

    @GetMapping("/get/{danmaku}")
    private void getDanmaku(@PathVariable("danmaku") String danmaku) {
        log.info(danmaku);
        danmakudao.setWechat("laughing");
        danmakudao.setMsg(danmaku);
        danmakudao.setPic("https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTIcUo7yZejHaB988CuNHXhNYPB2biaKg4IXAI3n1ng5FrqFH16RUL7EVLv6NoGXwse7XwJCEwVVSsA/132");
        danmakudao.setTime(new Date());
        dammakuMapper.insert(danmakudao);
    }

    @GetMapping("/show")
    private Page<Danmaku> show() {
        QueryWrapper<Danmaku> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("time");
        Page<Danmaku> Page = new Page<>(1, 5);
        Page = dammakuMapper.selectPage(Page, wrapper);
        return Page;
    }

}
