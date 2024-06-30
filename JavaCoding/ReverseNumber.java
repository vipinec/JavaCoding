package JavaCoding;

public class ReverseNumber {
    public static void main(String[] args){

    int n= 1234;

    // StringBuffer sb = new StringBuffer(String.valueOf(n));
    //  System.out.println(sb.reverse());


 StringBuilder sb2 = new StringBuilder();

sb2.append(n);

StringBuilder rev = sb2.reverse();

System.out.println(rev);
    }
    
}
