package JavaCoding;

import java.util.Scanner;

public class EvenOrOddNum {
    public static void main(String[] args){


        int n;

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number ");

        n=sc.nextInt();
        if(n%2==0){


            System.out.println("Even Number");
        }else{


            System.out.println("Odd Number");

        }
    }
    
}
