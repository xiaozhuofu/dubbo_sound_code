package com.xiaofu.jdk;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author xiaofu
 * @Date: 2021/5/13 15:01
 */
public class DriverMain {
    public static void main(String[] args) {
        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = serviceLoader.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println(driver);
        }
    }
}
