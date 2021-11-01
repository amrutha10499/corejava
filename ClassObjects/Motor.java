class Motor{

 String name="Dcmotor" ;

 int price =150;

 short voltage=12 ;

 byte current =12;

 byte weight =20;

 String types ;

 

 void rotates(){

 System.out.println("motor start rotating while giving power");

   }



 static int capacity(){

 System.out.println("each motor has its own capacity in hp");

  return 5;

  }



 void worktype(){

 System.out.println("motor works with AC or DC current");

   }

}
