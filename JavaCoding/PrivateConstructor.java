package JavaCoding;

class Pen{

    protected String password;
    protected int username;

     Pen(){

        password = "vjidso";
        username = 12345;

     }
}

public class PrivateConstructor {
    public static void main(String[] args){
        Pen dt = new Pen();

        System.out.println(dt.password);
        System.out.println(dt.username);

    }
    
}
