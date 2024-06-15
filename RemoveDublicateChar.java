package JavaCoding;

public class RemoveDublicateChar {
    public static void main(String[] args){

        String str = "programming";
        System.out.println("Before remove dublicate char " +str);


        StringBuilder sb1 = new StringBuilder();

        str.chars().distinct().forEach(c-> sb1.append((char)c));


     System.out.print("Before remove dublicate char is " + " " +sb1);



    }
    
}
