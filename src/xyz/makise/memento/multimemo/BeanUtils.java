package xyz.makise.memento.multimemo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Observable;

/*
 * Beans������
 * ��ʵ����Ŀ�� Spring Apache���߼�commons������Щ���� ֱ��ʹ�þͿ���
 * ���Ϊ��ͨ���� ����ʹ��java�еķ���������Ա��ݽ��и�ֵ
 * */
class BeanUtils {
    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> map = new HashMap<>();
//        ͨ������ķ��� Ϊ���ݸ�ֵ
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : propertyDescriptors
            ) {
//                ��ȡ��������
                String fieldName = des.getName();
//                ��ȡ���Ե�getter����
                Method getter = des.getReadMethod();
//                ��ȡ����ֵ
                Object fieldValue = getter.invoke(bean);
//                ������field��class�Ļ� ���Ž�map���� ���Ե�
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
