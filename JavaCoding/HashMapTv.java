package JavaCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTv {
    public static void main(String[] args){

        HashMap<String, Integer> map= new HashMap<String, Integer>();

        map.put("id", 21);
        map.put("name", 22);
        map.put("password", 24);

        map.put("india", 23);

        System.out.println(map.size());

        Set<String> set = map.keySet();

        for(String st : set){
            System.out.println(st);
        }

// for(Map.Entry<String, Integer> e : map.entrySet()){

//      //System.out.println(e.getKeys());
//     System.out.println(e.getValue());
//     System.out.println(e.getKey());

    
}
}
