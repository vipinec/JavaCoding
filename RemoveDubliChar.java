package JavaCoding;

public class RemoveDubliChar {

    public static void main(String[] args){


       // String str = "programming";
       String str = "programming";
        StringBuilder sb1 = new StringBuilder();
     


        for(int i=0; i<str.length(); i++){


           char ch = str.charAt(i);

            int idx = str.indexOf(ch, i+1);


            if(idx== -1){

                sb1.append(ch);
            }
        }

     System.out.print(sb1);
        }
    }
    

