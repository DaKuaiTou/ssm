package com.dkt.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: dkt
 * @Pcakage: com.dkt.utils.BeanFactory3
 * @Date: 2022年11月18日 14:11
 * @Description:
 */
public class BeanFactory3 {
    private static Map<String,Object> map = new HashMap<>();
    static {
        try {
            InputStream in = BeanFactory3.class.getClassLoader().getResourceAsStream("bean.xml");
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(in);
            List<Element> elements = document.getRootElement().elements();
            for (Element element : elements) {
                map.put(element.attributeValue("id"),Class.forName(element.attributeValue("class")).newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Object createBean(String id){
        return map.get(id);
    }
}
