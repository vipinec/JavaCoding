package JavaCoding;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args){


        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(5);

        list.add(10);

        list.add(12);
        //System.out.println(list);

       // System.out.println(list.get(2));

       //System.out.println(list.set(0,9));

        // System.out.println(list.remove(2));
        // System.out.println(list);
for(int i=0; i<list.size(); i++){

    System.out.println(list.get(i ));

}
Collections.sort(list);
System.out.println(list);

    }
    
}
