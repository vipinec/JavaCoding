package JavaCoding;
import java.util.LinkedList;
public class LinkedListTest {
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);

        list.add("only add");
        // System.out.println(list);

        // list.addLast("last added only");
        // System.out.println(list);
        // System.out.println(list.get(3));

        // System.out.println(list.size());
        // System.out.println(list.remove(0));
        // System.out.println(list);

        // list.removeFirst(0);
        for(int i=0; i<list.size(); i++){
            if(list.get(i)=="is"){
                System.out.print("element is now available here");

            }

            System.out.print(list.get(i) + " ");
        }








    }
    
}
