package JavaCoding;

public class Swap {
    public static void main(String[] args){

        int a=3;
        int b=4;
        System.out.println("Before Swapping "  +a+ " " +b);
        /* 
        int t;
        t=a;
        a=b;
        b=t;

        */


        // login second

        a=a+b; // 7
        b=a-b; // 7-4=3
        a=a-b; // 7-3 = 4

        System.out.println("After swapping is "+a+ " " +b);
    }
    
}
