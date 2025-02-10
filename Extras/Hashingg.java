// hashing basics.

package Extras;
import java.util.*;
public class Hashingg {
    public static void main(String[] args) {
        //Country(key) , Population(value)
        
        //insertion
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);//put is used for insertion
        map.put("usa", 20);
        map.put("China", 190);
    
        // System.out.println(map); //hashmap are unordered thing so it will print in any order.
    
        map.put("China", 120);
        // System.out.println(map);

        if(map.containsKey("China")){
            // System.out.println("Key  is present in the map");
        }
        else{ 
            // System.out.println("4O4");
        }


        // System.out.println(map.get("China"));
        // System.out.println(map.get("indionaiasa"));


        int arr[] = {12,15,18};
        for(int i=0;i<3;i++){
            // System.out.print(arr[i] + " ");

    }
    // System.out.println();
    for (int val : arr){
        // System.out.print(val +  " ");
    }
    // System.out.println();
    // 1st option
    for(Map.Entry<String, Integer> e :map.entrySet()){
        System.out.println(e.getKey() + " " + e.getValue());
    }
// 2nd option
Set<String> keys = map.keySet();
for(String key : keys){
    System.out.println(key+ " " + map.get(key));
}

map.remove("china");
System.out.println(map);




    }
}
