package com.xiaofu.jdk.impl;

import com.xiaofu.jdk.Log;

/**
 * @author xiaofu
 * @Date: 2021/5/13 14:50
 */
public class Log4j implements Log {
    @Override
    public void info(String msg) {
        System.out.println("log4j info :" + msg);
    }
}
