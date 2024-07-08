package JavaCoding;

class Smaer{

private String name;
private String password;

public String getname(){

    return name;   
}
public String setname(String name){

    this.name= name;
    return name;
}

public String getpass(){

    return password;   
}
public String setpassword(String password){

    this.password= password;
    return name;
}

}

public class Abcd {
    public static void main(String[] args){
        Smaer bb = new Smaer();
        bb.setname("apnaname");
        bb.getname();

        System.out.println(bb.getname());

        bb.setpassword("abcdefi123");
        System.out.println(bb.getpass());

    }
    
}
