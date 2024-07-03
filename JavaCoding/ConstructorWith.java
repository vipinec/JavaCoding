package JavaCoding;


class Commu{


     String pass;


    Commu(){
          pass= "123sjdj";
         System.out.println("contructor called first");

    }
}

public class ConstructorWith {
    public static void main(String[] args){

        Commu fn = new Commu();

        System.out.println(fn.pass);


    }
    
}
