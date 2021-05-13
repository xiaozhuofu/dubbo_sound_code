package com.xiaofu.dubbo.impl;

import com.xiaofu.dubbo.Protocol;

/**
 * @author xiaofu
 * @Date: 2021/5/13 17:19
 */
public class DubboProtocol implements Protocol {
    @Override
    public void communicate() {
        System.out.println("采用dubbo协议进行通信.....");
    }
}
