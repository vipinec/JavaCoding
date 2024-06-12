package JavaCoding;

public class Recursionlogic {

    public static int sum(int start, int end){
        if(end>start){
            return end + sum(start,end-1);
        }
        else{

            return start;
        }
    }

    public static void main(String[] args){

        System.out.println(sum(5,10));


    }
    
}
