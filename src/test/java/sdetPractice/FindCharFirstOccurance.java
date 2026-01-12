package sdetPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindCharFirstOccurance {
    public static void main(String[] args) {
        String input="subhashini";
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(Character c:input.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        Character ch=map.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);    
        System.out.println(ch);
    }
}
