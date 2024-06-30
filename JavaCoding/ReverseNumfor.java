package JavaCoding;

public class ReverseNumfor {
    public static void main(String[] args){


        int n=123456;
        int rev=0;

        for(int i =0; i<=n; i++ ){


            rev=rev*10+ n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
    // reverse number hightly recommed to use while loop
    
}
