package com.dkt.utils;

/**
 * @author: dkt
 * @Pcakage: com.dkt.utils.BeanFactory
 * @Date: 2022年11月18日 11:10
 * @Description:
 */
public class BeanFactory {

    /*
    *   根据类的全限定类名来创建对象
    * */
    public static Object createBean(String className){
        try {
            return Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
