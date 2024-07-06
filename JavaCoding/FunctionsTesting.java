package JavaCoding;

public class FunctionsTesting {


    public static void testone(int a, int b){

        int sum = a+b;
        System.out.println(sum);
        return;


    }
    public static int multi(int a, int b){

        int multiple = a*b;
        return multiple;


    }


    public static String addi(String name, String password){

        String deshi = name + password;
        System.out.print(deshi + " ");

        return name;
    }


    public static void saddi(String str1, String str2){

        if(str1.equals(str2)){
        System.out.println("both string is euals");

        } else{

            System.out.println("strings are not equals");
        }
       return;


    }
    public static void main(String[] args){
        testone(2,4);

        int muli =multi(2,5);
        System.out.println(muli);

        addi("Jai", "Krishna");
        System.out.println();

        saddi("java","java");


    }
    
}
