package JavaCoding;
class Coolage{

    String studentname;
    int id;
    String classname;
    boolean pass;

 Coolage(String name, int ID, String kasha, boolean pass){

    this.studentname= name;
    this.id=  ID;
    this.classname= kasha;
    this.pass=pass;

 }
}

public class ConstructorTest {
    public static void main(String[] args){

        Coolage st = new Coolage("vimal", 123, "B.Tech", true );

        System.out.println(st.classname + " " + st.id + " " + st.studentname + " " + st.pass);
    }
    
}
