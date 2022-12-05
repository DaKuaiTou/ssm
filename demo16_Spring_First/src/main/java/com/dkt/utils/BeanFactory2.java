package com.dkt.utils;

import com.dkt.service.UserService;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: dkt
 * @Pcakage: com.dkt.utils.BeanFactory2
 * @Date: 2022年11月18日 11:18
 * @Description:
 */
public class BeanFactory2 {
    private static Map<String,String> map = new HashMap<String, String>();

    static {
        SAXReader saxReader = new SAXReader();
        InputStream in = BeanFactory2.class.getClassLoader().getResourceAsStream("bean.xml");
        try {
            Document document = saxReader.read(in);
            List<Element> elements = document.getRootElement().elements();
            for (Element element : elements) {
                String id = element.attributeValue("id");
                String aClass = element.attributeValue("class");
                map.put(id,aClass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    *   根据bean标签的id获取class值
    * */
    public static Object createBean(String id){
        try {
            String aclass = map.get(id);
            return Class.forName(aclass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
