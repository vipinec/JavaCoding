package JavaCoding;
import java.util.HashSet;
import java.util.Iterator;

public class ShashSeta {
    public static void main(String[] args){

        HashSet<Integer> set= new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4); // dublicate value not alloed in hashset
        set.add(4);

        System.out.println(set);

        set.remove(2);
        System.out.println(set);

        if(set.contains(1)){
            System.out.println("contain one");
        }


        Iterator it = set.iterator();

        while(it.hasNext()){

            //System.out.println(it.hasNext());
        }

            
        }



    }
    
