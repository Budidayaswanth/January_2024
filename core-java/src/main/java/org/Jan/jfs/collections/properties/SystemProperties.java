package org.Jan.jfs.collections.properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
        String dtrName =properties.getProperty("java.io.tmpdir");
        System.out.println(dtrName);
        String fileName =dtrName+"/temp.txt";
        File file=new File(fileName);
        FileWriter fw =null;
        try {
            fw =new FileWriter(file);
            fw.write("Hello-Word");
            fw.close();
        }catch ( IOException e){
            throw new RuntimeException(e);
        }
    }
}
