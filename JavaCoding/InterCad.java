package JavaCoding;


interface Vehicle{


    void startcar();
    void stopcar();
}
 

    class Cars implements Vehicle{

        public void startcar(){

            System.out.println("car start now");
        }

        public void stopcar(){

            System.out.println("stop the car");
        }


    }




public class InterCad {
    public static void main(String[] args){

        Cars tt= new Cars();
        tt.startcar();
        tt.stopcar();
        


    }
    
}