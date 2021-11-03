class TestComputer{
public static void main(String []args){
 
  Computer.brand();

   float res=Computer.version();
   System.out.println(res);
   
   String S=Computer.os();
   System.out.println(S);
 
  
   Computer C = new Computer();
   int result= C.price();
    System.out.println(result);
 
 
     }



}