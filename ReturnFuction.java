package JavaCoding;

import java.util.Scanner;

public class ReturnFuction {
    //int a, b;

    public static int addition(int a, int b){

        int sum =  a+b;
        return sum;

    }


    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();


        System.out.print(addition(a,b) +  " " +"SUM OF two number ");



    }
    
}
