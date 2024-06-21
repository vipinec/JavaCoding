package JavaCoding;

public class StringCount {
    /**
     * @param args
     */
    public static void main(String[] args){

        //Java Program to count the total number of characters in a string


        String str = "java cod";

        //int len= str.length();

        int count =0;

        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;  

        }
        System.out.println(count + " how many is ");
    }
    
}
