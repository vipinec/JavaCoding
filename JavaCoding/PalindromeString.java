package JavaCoding;

public class PalindromeString {

    public static void main(String[] args){

        String str= "madam";
  String rev= "";

  String origin= str;

  int len= str.length();

  for(int i=len-1; i>=0; i--){

    rev= rev+str.charAt(i);
  }

  if(origin.equals(rev)){

    System.out.println("Palindrome string");
  }else{


    System.out.println("Not Palindrome string");

  }

    }
    
}
