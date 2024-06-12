package JavaCoding;

final class NeverChange{

    protected String carbrand;

    public void car(){
        System.out.println("car of BMW");
    }

    public String setcarbrand(){
    return  carbrand="jocky bhai";

    }
}

public class FinalInheritance  {
    public static void main(String[] args){

        NeverChange vv= new NeverChange();
        vv.car();
        System.out.println(vv.setcarbrand());




        //System.out.println(vv.car());
    }

    // GETTING ERROR WHIC DISPLAYING FINAL CLASS CANNOT INHERIATED FRON ANOTHER CLASS
    
}
