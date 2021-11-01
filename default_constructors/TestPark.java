class TestPark{

public static void main(String []a){

Park P =new Park();
P.area();
P.uses();
P.name="cubbonpark";
String name=P.name;
System.out.println(name);

P.entryfees=100;
byte entryfees=P.entryfees;
System.out.println(entryfees);



P.timings=8;
int timings=P.timings;
System.out.println(timings);

}

}