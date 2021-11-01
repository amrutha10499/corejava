class TestMammals{
public static void main(String []args){

Mammals mam=new Mammals();
String types=mam.types;
mam.types="egg laying ,reproduce their young ones";
System.out.println(mam.types);

int legs=mam.legs;
mam.legs=4;
System.out.println(mam.legs);

float height=mam.height;
mam.height=5.0f;
System.out.println(mam.height);

}


}