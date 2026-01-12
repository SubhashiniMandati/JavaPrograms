package Streams;

import java.util.Arrays;
import java.util.List;

public class ConvertStingListToUpperCase {
    public static void main(String[] args) {
       // List<String> nameList= Arrays.asList("Subhashini","Ravi","Rohith","Rishika");
        List<String> nameList= Arrays.asList("");
        System.out.println(upperCase(nameList));
    }
    public static List<String> upperCase(List<String> nameList ){
        if(nameList==null || nameList.isEmpty()){
            //return Collections.emptyList();
            return nameList;
        }
return nameList.stream().
        map(String::toUpperCase)
        .toList();
    }


}
