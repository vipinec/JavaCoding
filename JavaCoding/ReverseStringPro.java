package JavaCoding;

public class ReverseStringPro {
    public static void main(String[] args){

    String str = "java";

    String rev = "";

    int len= str.length();

    for (int i= len-1; i>=0; i--){

        rev= rev+str.charAt(i);

    }

System.out.print(rev + " ");
    
}
}