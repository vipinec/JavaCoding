package JavaCoding;


class Home{

    String name;
    int age;
}

class Dore extends Home{

    String pass;

    Boolean idcorret;

    public void soundinfo(){

        System.out.println("home sounfinfo test now");
    }

}

public class Inheritance1 {
    public static void main(String[] args){
        Dore d = new Dore();

        d.name= "apna dore one";
        d.age= 24;

        System.out.println(d.name + "\n and age is : " + d.age);


        d.pass= "12345hfk";
        d.idcorret=false;

        System.out.println(d.pass + " " + d.idcorret);

    }
    
}
