package JavaCoding;


class Moye{


    private String password;
    private String username;


    public Moye(String password, String username){

        this.password= password;
        this.username= username;

    }
   public String getpassword(){
    return password;
   }
public void setpassword(String password){


}

public String getusername(){
    return username;
}
public void setusername(String username){

}

}

public class PrivateConstru {
    public static void main(String[] args){

        Moye mt = new Moye("apna@1223", "vipinfunny");
        mt.getpassword();
        mt.getusername();
        System.out.println(mt.getpassword() +"\n" + mt.getusername());





    }
    
}
