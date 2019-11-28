package com.ifmo.lesson19;

import javax.accessibility.Accessible;
import java.lang.reflect.Field;
import java.util.Set;

public class ReflectionUtils {
    public  static String toString(Object obj) throws IllegalAccessException{
        String name = null;
        String sum = "classe A"+",";
        for (Field declaredField : obj.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);
            String fieldName = declaredField.getName();
            Object fieldValue = declaredField.get(obj);
            fieldValue=fieldValue.toString();
            name = fieldName+"="+fieldValue+" ";
            sum = sum+name;
        }
        return sum;
    }
}
