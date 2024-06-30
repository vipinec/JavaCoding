package JavaCoding;


abstract class Animal{

    String type;
    int age;

    abstract void setup(); 
}
    class Sole extends Animal{

        public void setup(){

            System.out.println("inheritated abstract method first");
        }

    }


public class Abstract  {
    public static void main(String[] args){

        Sole FF= new Sole();

        FF.type= "RED";
        FF.age= 20;

        System.out.println(FF.type + "" + FF.age);
            
    


    }
    
}
