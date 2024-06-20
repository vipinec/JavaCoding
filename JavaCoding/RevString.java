package JavaCoding;

public class RevString {
    public static void main(String[] args){


        String str= "Java";
        String rev="";
/* 
        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev= sb.reverse();
        System.out.println(rev);

*/
        char[] ch = str.toCharArray();

        for(int i=ch.length-1; i>=0; i--){

             rev= rev+ch[i];
        

        }

      System.out.println(rev);
    }
    
}
