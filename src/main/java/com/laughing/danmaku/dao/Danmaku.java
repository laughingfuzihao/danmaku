package com.laughing.danmaku.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/8/4 13:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class Danmaku {
    private int id;
    private String wechat;
    private String msg;
    private String pic;
    private Date time;
}
