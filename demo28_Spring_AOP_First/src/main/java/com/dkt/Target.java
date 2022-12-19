package com.dkt;

/**
 * @author: dkt
 * @Pcakage: com.dkt.Target
 * @Date: 2022年12月08日 20:24
 * @Description:
 */
public class Target implements TargetInterface {
    @Override
    public void addUser() {
        System.out.println("Target addUser running");
    }
}
