package JavaCoding;

class Student{

String langauge;

int age;
float salary;

 Student(String langauge, int age, float salary){

    this.langauge= langauge;
    this.age= age;
    this.salary= salary;

}
}

public class ConstructorParameter {
    public static void main(String[] args){

        Student ss1 = new Student("Enlgish", 25, 25.0f);

       // System.out.println(ss.langauge + " " + ss.age + " " + ss.salary);

       System.out.println(ss1.langauge);
       System.out.println(ss1.age);
       System.out.println(ss1.salary);


    }
    
}
