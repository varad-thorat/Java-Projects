//wajp to demonstrate String functions and also String is
//immutable => needs to save everytime or else they are lost

class P13{
public static void main(String args[]){
String s1 = "KamalSir";
System.out.println(s1);

//s1.toUpperCase() wont work as string is immutable 
//and so needs to be saved

s1 = s1.toUpperCase();
System.out.println(s1);

s1 = s1.toLowerCase();
System.out.println(s1);

s1 = s1.concat(" rocks");
System.out.println(s1);
}
}