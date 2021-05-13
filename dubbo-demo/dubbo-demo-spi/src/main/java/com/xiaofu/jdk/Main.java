package com.xiaofu.jdk;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author xiaofu
 * @Date: 2021/5/13 14:52
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
        Iterator<Log> iterator = serviceLoader.iterator();
        while (iterator.hasNext()){
            Log log = iterator.next();
            log.info("JDK SPI");
        }
    }

}
