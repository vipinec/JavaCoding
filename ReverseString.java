package JavaCoding;

public class ReverseString {
    public static void main(String[] args){

       // System.out.print("Revrese string is :" +  str);


        String str = "java";
        System.out.println("Before reverse string is :" +  str);

        int len = str.length();

    String rev = "";



    for (int i= len-1; i>=0; i--){

        rev = rev+str.charAt(i);
    }
    System.out.print("Revrese string is : " +rev);
    }

}
