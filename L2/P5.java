//wajp to read age of user
// and print if user can vote or cannot

class P5{
public static void main(String args[]){
double age = Double.parseDouble(args[0]);
String res = age>=18 ? "can":"cannot";
System.out.println("Your age = " + age);
System.out.println("vote = " + res);
}
}