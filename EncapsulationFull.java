package JavaCoding;
class PriA{

   private String gamecode;



   public String getgamecode(){
    return gamecode;
   }


   public void setgamecode(String newcode){
    this.gamecode = newcode;
   }
}

public class EncapsulationFull {
    public static void main(String[] args){

        PriA jj = new PriA();

        jj.setgamecode("234cm43");
        System.out.println(jj.getgamecode());



    }

}



