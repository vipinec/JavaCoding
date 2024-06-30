package JavaCoding;

public class PalindromeNumber {

    public static void main(String[] args){

        int n=142;

        int rev=0;

        int orginoutput=n;

        while(n!=0){


            rev= (rev*10) + n%10;

            n=n/10;


        }

        if(orginoutput == rev){

            System.out.println("Palindrome number");
        }else{

            System.out.println("Not Palindrome number");

        }
    }
    
}
