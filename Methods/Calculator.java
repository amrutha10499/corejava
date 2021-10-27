class Calculator{
   static void add(){
    System.out.println("it performs the addition operation");
   }
	 static void sub(){
    System.out.println("it performs the subtraction operation");
   
   }
    static void div(){
	System.out.println("it performs the multiplication operation");	
	}
   static void show(String []oper){
	   
	for(int i=0;i<oper.length;i++)
		System.out.println(oper[i]);
   }
}