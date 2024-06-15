package JavaCoding;
abstract class A{

    private String name;

    private String password;

    public int mobilenumber;

    abstract void drive();

    public void gmaeplay(){

        System.out.println("Lodo game play");

    }
 class Car extends A{

    public String getname(){

        return name;
    }

    //public void setname(String newname){
       // this.name = newname;

    


    public  void drive(){

        System.out.println("Drive car");
    }

    public void gmaeplay(){

        System.out.println("Lodo game play");

    }


 }


}



public class Abstract {
    public static void main(String[] args){

   

    }


    
}
