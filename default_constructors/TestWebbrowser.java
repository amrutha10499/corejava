class TestWebbrowser{
public static void main(String []args){

Webbrowser W=new Webbrowser();
String name=W.name;
W.name="Internet Explorer";
System.out.println(W.name);

byte version=W.version;
W.version=9;
System.out.println(W.version);

boolean IsWebbrowserslow=W.IsWebbrowserslow;
W.IsWebbrowserslow=true;
System.out.println(W.IsWebbrowserslow);





}

}