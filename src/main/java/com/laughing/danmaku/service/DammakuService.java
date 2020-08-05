package com.laughing.danmaku.service;


import com.laughing.danmaku.dao.Danmaku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.laughing.danmaku.mapper.DammakuMapper;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/4 14:02
 */
@Service
public class DammakuService {
    @Autowired
    private DammakuMapper dammakuMapper;

    public void saveDammaku(Danmaku dammaku) {
        dammakuMapper.insert(dammaku);
    }

}
