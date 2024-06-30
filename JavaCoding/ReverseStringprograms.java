package JavaCoding;

public class ReverseStringprograms {

    public static void main(String[] args){

        String str = "automation";

        String rev="";

        char[] ch = str.toCharArray();

        for (int i= ch.length-1; i>=0; i--){


            rev= rev+ch[i];
        }
      System.out.println(rev);

    }
    
}
