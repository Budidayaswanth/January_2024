package org.Jan.jfs.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        String data ="Butterfly Butterfly Butterfly Butterfly where are you going where are you going ";
        String[] arr =data.split(" ");
        Map<String,Integer> wordCountMap =new HashMap<>();
        for (String word :arr){
          /*  if (wordCountMap.containsKey(word)){
                wordCountMap.put(word,wordCountMap.get(word)+1);
            }
            else {
                wordCountMap.put(word,1);
            }*/
            wordCountMap.put(word,wordCountMap.getOrDefault(word,0)+1);
        }
        System.out.println(wordCountMap);
    }
}
