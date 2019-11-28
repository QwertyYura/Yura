package com.ifmo.lesson19;

import java.lang.reflect.Field;

public class ReflectionUtils {
    public  static String toString(Object obj) throws IllegalAccessException{
        String name = null;
        for (Field declaredField : obj.getClass().getDeclaredFields()) {
            String fieldName = declaredField.getName();
            Object fieldValue = declaredField.get(obj);
            fieldValue=fieldValue.toString();
            name = fieldName+"="+fieldValue;
        }
        return name;
    }
}
