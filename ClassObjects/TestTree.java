class TestTree{

public static void main(String []a)

{

Tree str=new Tree();
String TreeName = str.name;
System.out.println(TreeName);
byte Treebranch = str.branch;
System.out.println(Treebranch);

str.grow();
str.o2();
str.source();
String res = str.cutting();
System.out.println(Treebranch);

}

}