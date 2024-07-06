package JavaCoding;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args){

        int size;

        Scanner sc= new Scanner(System.in);

        size=sc.nextInt();

        int numbers[]= new int[size];
// input
        for (int i=0; i<size; i++){

            numbers[i]= sc.nextInt();

            //System.out.println(numbers[i]);
        }

        // out
        for (int i=0; i<size; i++){
    System.out.println(numbers[i]);
        }
    }

}
