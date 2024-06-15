package JavaCoding;

public class ReverseStr {
    public static void main(String[] args){


        String str = "automation";

        char[] ch = str.toCharArray();


        String rev = "";

        for(int i= ch.length-1; i>=0; i--){


            rev = rev+ch[i];
        }

   System.out.print(rev);

    }
    
}
