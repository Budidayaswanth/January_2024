package org.Jan.jfs.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("krish",23);
        map.put("vinay",32);
        map.put("king",45);
        map.put("uma mahesh",27);
        map.put("yashwanth",34);
        System.out.println(map);
        System.out.println(map.get("krish"));
        System.out.println(map.get("king"));

        map.putIfAbsent("hemanth",33);
        System.out.println(map);

        if (map.get("king") != null){
            map.put("king",map.get("king")+2);
        }
        System.out.println(map);
    }
}
