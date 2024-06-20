package JavaCoding;

public class PalindromeNum {
    public static void main(String[] args){

        int n=141;

        int c=n;
        int rev=0;

        while(n>0){

      rev = (rev*10) + n%10;
      n=n/10;
        }

      if(c==rev){

        System.out.println("palindrome number");


      }else{
        System.out.println("Not a palindrome number");

      }


        }
    }
    
