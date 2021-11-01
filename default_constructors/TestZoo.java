class TestZoo
{
   public static void main(String []a)
     {
      Zoo z=new Zoo();
	  z.animal();
	  z.trees();
	  z.know();
	  
       String name=z.name;
	   System.out.println(name);
	   
       float time=z.time;
	   System.out.println(time);
	   
	   int fees=z.fees;
       System.out.println(fees);

	}

}