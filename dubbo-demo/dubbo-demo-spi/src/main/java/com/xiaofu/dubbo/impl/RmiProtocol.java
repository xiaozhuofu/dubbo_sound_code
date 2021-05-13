package com.xiaofu.dubbo.impl;

import com.xiaofu.dubbo.Protocol;

/**
 * @author xiaofu
 * @Date: 2021/5/13 17:37
 */
public class RmiProtocol implements Protocol {
    @Override
    public void communicate() {
        System.out.println("采用rmi协议进行通信......");
    }
}
