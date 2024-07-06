package JavaCoding;

public class ArrayProgramming {
    public static void main(String[] args){


        int numers[]= {2,4,6,8,10};
        int x=81;

        for(int i=0; i<numers.length; i++){

            if(numers[i]==x){
            System.out.print("matiching x at index :" +i);

            }else{
                System.out.print("not found x" +i);
            }


        }
    }
}


