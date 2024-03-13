package org.Jan.jfs.collections.properties;

import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFiles {
    public static void main(String[] args) {
        Properties properties =new Properties();
        try {
            properties.load(ReadingPropertiesFiles.class.getResourceAsStream("/db.properties"));
            System.out.println(properties.getProperty("db.url"));
            System.out.println(properties.getProperty("db.username"));
            System.out.println(properties.getProperty("db.password"));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
