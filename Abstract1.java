package JavaCoding;
 abstract class Animal{


    public void setup(){

        System.out.println("animal public class");
    }
}

public class Abstract1 extends Animal{
    public static void main(String[] args){

        Abstract1 hh = new Abstract1();
        hh.setup();


    }
    
}
