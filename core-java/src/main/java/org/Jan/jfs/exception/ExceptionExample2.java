package org.Jan.jfs.exception;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ExceptionExample2 {
    public static void main(String[] args) {
        System.out.println("Start the main method ");
        List<String> list = readDataFromFile("kingdom.csv");
        for (int i=1;i<=list.size();i++){
            String[] arr =list.get(i).split(",");
            String name =arr[0];
            if (name.length() >=4){
                name=arr[0].trim().substring(0,4).toUpperCase();
                System.out.println(name);
            }
            System.out.println(name.toUpperCase());
        }
        System.out.println("End the main method ");
    }

    private static List<String> readDataFromFile(String fileName) {
        List<String> list =new ArrayList<>();
        try{
            list =Files.readAllLines(Path.of(ExceptionExample2.class.getResource("/"+fileName).toURI()));
        }catch (IOException e){
            System.out.println("While reading the file :"+fileName);
            e.printStackTrace();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
