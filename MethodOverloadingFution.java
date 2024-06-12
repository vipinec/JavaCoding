package JavaCoding;

public class MethodOverloadingFution {



    static int overthink(int x, int y){

return x+y;
    }
    

    static double overthink(double x, double y){

        return x*y;

    }

    public static void main(String[] args){

        System.out.println(overthink(3,4));

        System.out.println(overthink(3.4,2.0));




    }
}
