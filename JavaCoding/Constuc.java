package JavaCoding;


class Voting{

    String votingage;
    int age;
    double salaryy;

    Voting(String Voting, int age, double salaryy){
        this.votingage= Voting;
        this.age= age;
        this.salaryy=salaryy;

    }
}

public class Constuc {
    public static void main(String[] args){

 Voting vtv = new Voting("nunineteen", 19, 23050.40d);

 System.out.println(vtv.votingage);
 System.out.println(vtv.age);
 System.out.println(vtv.salaryy);


    }
    
    
}
