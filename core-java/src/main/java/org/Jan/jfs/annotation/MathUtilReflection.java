package org.Jan.jfs.annotation;

import java.lang.reflect.Method;

public class MathUtilReflection {
    public static void main(String[] args) {
        Class<? extends MathUtil> cls = MathUtil.class;
        Method[] methods = cls.getMethods();
        for (Method method:methods){
            if(method.isAnnotationPresent(DocInfo.class)) {
                DocInfo docInfo = method.getAnnotation(DocInfo.class);
                System.out.println("MethodName :" + method.getName());
                System.out.println("Author :" + docInfo.author());
                System.out.println("CreateDate :" + docInfo.createDate());
                System.out.println("description :" + docInfo.description());
            }
        }
    }
}
