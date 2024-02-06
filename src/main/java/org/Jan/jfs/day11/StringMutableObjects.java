package org.Jan.jfs.day11;

public class StringMutableObjects {
    public static void main(String[] args) {
        String name ="Krish";
        String empNo="101";
        String salary="10000";
        String location="Hyderabad";

        StringBuilder  sb =new StringBuilder();
        sb.append(name).append(",").append(empNo).append(",").append(salary).append(",").append(location);
        System.out.println(sb.toString());
    }
}
