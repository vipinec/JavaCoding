package JavaCoding;

// public class Cons {

    class Student{
    
        String name;
        String password;
    
        Student(String name, String password){
    
            this.name=name;
            this.password= password;
    
           
        }
        public void printinfo(){
            System.out.println("constructor called me");
    
        }
        
    }
    
    
    public class Cons {
        public static void main(String[]args){
            Student aa= new Student("vkvimal", "sjdk123");
    
            System.out.println(aa.name + " " + aa.password);
            aa.printinfo();
        }
        
    }
    
