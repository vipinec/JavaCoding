package JavaCoding;

public class ReverseString {
    public static void main(String[] args){

        String str ="Automation";

        System.out.println("Before Revese String is "+str);

        String rev ="";

        int len= str.length();

        for(int i= len-1; i>=0; i--){

            rev= rev+str.charAt(i);
        }
System.out.println("Revese String is "+rev);




    }
    
}
