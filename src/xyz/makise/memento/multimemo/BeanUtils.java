package xyz.makise.memento.multimemo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Observable;

/*
 * Beans工具类
 * 在实际项目中 Spring Apache工具集commons会有这些功能 直接使用就可以
 * 这边为了通用性 必须使用java中的反射机制来对备份进行赋值
 * */
class BeanUtils {
    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> map = new HashMap<>();
//        通过反射的方法 为备份赋值
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : propertyDescriptors
            ) {
//                读取属性名称
                String fieldName = des.getName();
//                读取属性的getter方法
                Method getter = des.getReadMethod();
//                读取属性值
                Object fieldValue = getter.invoke(bean);
//                如果这个field是class的话 不放进map里面 忽略掉
                if (!fieldName.equalsIgnoreCase("class")) {
                    map.put(fieldName, fieldValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void restoreProp(Object bean, HashMap<String, Object> map) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : propertyDescriptors
            ) {
                String fieldName = des.getName();
                if (map.containsKey(fieldName)) {
                    Method setter = des.getWriteMethod();
                    setter.invoke(bean, map.get(fieldName));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
