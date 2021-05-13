package com.xiaofu.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author xiaofu
 * @Date: 2021/5/13 17:34
 */
public class ProtocolMain {
    public static void main(String[] args) {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol protocol = extensionLoader.getDefaultExtension();
        protocol.communicate();


        //dubbo
        Protocol dubbo = extensionLoader.getExtension("dubbo");
        dubbo.communicate();
        //rmi
        Protocol rmi = extensionLoader.getExtension("rmi");
        rmi.communicate();
    }
}
