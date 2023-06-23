//wajp to read integer from the user
//check if the number is even or odd
//CLA
class P1{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
String res = num % 2 == 0 ? "even " : "odd";
System.out.println("res = "+ res);
}
}