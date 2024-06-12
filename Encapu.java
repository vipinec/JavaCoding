package JavaCoding;

class Hima{

private int mobileNumber;
private String money;
private double salary;
protected int run=30;


public int getmobileNumber(){

    return mobileNumber;
}

public void setmobileNumber(int number){

    this.mobileNumber= number;
}
public String getmoney(){

    return money;
}

public void setmoney(String newmoney){
    this.money = newmoney;

}
}

public class Encapu {
    public static void main(String[] args){

        Hima jj= new Hima();

        jj.setmobileNumber(8840604);
        System.out.println("Private mobile number is "+jj.getmobileNumber());

        jj.setmoney("9473882");
        System.out.println("Private meney in swis bank "+jj.getmoney());

        System.out.println(jj.run);











    }
    
}
