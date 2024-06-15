package JavaCoding;

abstract class GmaerPlayer{

    abstract void pk();

}

class Dog extends GmaerPlayer{


    public void pk(){

        System.out.println("inheeriated pk method");
    }
}


public class AbMethod {
    public static void main(String[] args){

        Dog yy= new Dog();

        yy.pk();

    }
    
}
