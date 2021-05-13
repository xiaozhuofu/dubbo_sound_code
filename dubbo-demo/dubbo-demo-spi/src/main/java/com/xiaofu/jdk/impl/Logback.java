package com.xiaofu.jdk.impl;

import com.xiaofu.jdk.Log;

/**
 * @author xiaofu
 * @Date: 2021/5/13 14:54
 */
public class Logback implements Log {
    @Override
    public void info(String msg) {
        System.out.println("logback info :" + msg);
    }
}
