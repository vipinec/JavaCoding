package JavaCoding;

public class Functionreturn {


    public static String apnaname(String name){

        System.out.println(name);
        return name;
    }


    public static int multiple(int a, int b, int c){

      int mul=a*b*c;
      System.out.println(mul + " ");
        return mul;
    
       
    }

 public int division(int f, int g){

    int di = f/g;
    System.out.println(di);
    return di;
 }


 public  float calculation(float o, float p){

    float fun=  o * p;
    System.out.println(fun);
    return fun;
 }

    public static void main(String[] args){

       


        Functionreturn obj= new Functionreturn();

        obj. calculation(12.4f, 4.0f);

        String how = apnaname("apna collage group");
        //System.out.println(how);

       int jack= multiple(12,32,21);

       obj.division(4,2);

    


    }
    
}
