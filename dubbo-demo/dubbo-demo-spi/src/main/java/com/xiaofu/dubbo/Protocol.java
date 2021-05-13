package com.xiaofu.dubbo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author xiaofu
 * @Date: 2021/5/13 17:18
 */
@SPI("dubbo")
public interface Protocol {
    void communicate();
}
