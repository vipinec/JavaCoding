package JavaCoding;
class Bool{

    String bookname;
    String bookprice;
    int bookstore;


    Bool(String bookname, String bookprice, int bookstore){

this.bookname= bookname;
this.bookprice= bookprice;
this.bookstore=bookstore;
    }
public void setup(){

    System.out.println("constuctor called");
}


    }


public class hellojaba {
    public static void main(String[] args){
        System.out.println("kalx");

        Bool obj = new Bool("apnabook", "243.00", 290);

    System.out.println(obj.bookname + " " + obj.bookprice + " " + obj.bookstore);
    obj.setup();
    }
    
}
