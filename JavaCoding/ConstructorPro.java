package JavaCoding;


class Student{

    String name;
    int age;

Student(){


}
}

// defalut constructor and no parameter constructor
public class ConstructorPro {
    public static void main(String[] args){
        Student st = new Student();
        st.age=21;
        st.name="vk";

        System.out.println(st.age + "" + st.name);



    }
    
}
