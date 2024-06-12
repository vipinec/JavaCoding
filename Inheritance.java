package JavaCoding;


class Animal{

    public void sound(){

        System.out.println("Animal sound :  awww");
    }
}
 class Pig extends Animal{

    public void sound(){

        System.out.println(" pig sound :  rewww... awwwl");
    }
 }
    class Dog extends Animal{

        public void sound(){

        System.out.println("dog sound is  :  barking ");
    }
 
    }


public class Inheritance {
    public static void main(String[] args){

        Dog dc = new Dog();
        dc.sound();
        

        Pig dc1 = new Pig();
        dc1.sound();

        Animal dc2 = new Animal();
        dc1.sound();


    }
    
}
