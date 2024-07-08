package JavaCoding;
import java.util.HashMap;

public class HashmapTest {
    public static void main(String[] args){

        HashMap<String, Integer> map= new HashMap<String, Integer>();

        map.put("id", 20);
        map.put("name", 21);
        map.put("password", 23);

        map.put("india", 20);

        System.out.println(map);

        map.remove("name");
        System.out.println(map);

      System.out.println(map.get("india"));


//         if(map.containsKey("password")){
//             System.out.println("available hai paas");
//         }

// if(map.containsValue(23)){

//     System.out.println("value availablke hai ");
// }

// for(Map.Entry<String, Integer> e : map.entrySet()){

//     System.out.println(e.getKeys());
//     System.out.println(e.getValue());

}
    }
    

