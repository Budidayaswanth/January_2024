/*
package org.Jan.jfs.annotation;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;

public class ParserManager {
    public static void main(String[] args) {
        ParserManager obj =new ParserManager();
    }
    public void parseData(){
        String packageName ="org.Jan.jfs.annotation";
        Set<Class> classes =findAllClassesUsingClassLoader(packageName);
        for (Class cls :classes){
            if (cls.isAnnotationPresent(Parser.class)){
                try {
                    cls.getMethod("parse").invoke(cls.newInstance());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public Set<Class> findAllClassesUsingClassLoader(String packageName) {
        InputStream stream =ClassLoader.getSystemClassLoader().getResourceAsStream(packageName.replaceAll("[.]","/"));
        BufferedReader reader =new BufferedReader(new InputStreamReader(stream));
        return reader.lines()
                .filter(line ->line.endsWith(".class"))
                .map(line -> getClass(line,packageName))
                .collect(Collectors.toSet());
    }
    private class getClass(String className, String packageName){
        try{
            return Class.forName(packageName+"."+className.substring(0,className.lastIndexOf(".")));
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
*/
