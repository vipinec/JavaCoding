package JavaCoding;

public class ParameterizeConstructor {
    int a;
    int b;
    String name;
    String collage;

    public ParameterizeConstructor(int a, int b, String name){

        this.a= a;
        this.b=b;
        this.name= name;

    }

    public ParameterizeConstructor(int x, int y, String age, String collage){

        this.a= x;
        this.b=y;
        this.name= age;
        this.collage= collage;

    }


    public static void main(String[] args){

        ParameterizeConstructor fc = new ParameterizeConstructor(20, 30, "vipin", "apnacollage");
       // fc.ParameterizeConstructor();

       System.out.print(fc.a + " " + fc.b + " " + fc.name);
       System.out.println(fc.collage);


    }
    
}
