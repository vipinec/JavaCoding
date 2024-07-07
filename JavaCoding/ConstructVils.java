package JavaCoding;

    
    class Student{

        String username;
        String password;
    
        int age;
        Student(String username, String password, int age){
    
            this.username= username;
    
            this.password= password;
            this.age=age;
    
        }
    
       public void printinfo(){
    
        System.out.println("constructor function calling");
     
    }
    }
    public class ConstructVils {
    
        public static void main(String[] args){
    
            Student s1= new Student("apna@gmail.com", "1234@abcd", 27);
            s1.printinfo();
            System.out.println(s1.username + " " + s1.password + " " + s1.age);
    
        }
    }