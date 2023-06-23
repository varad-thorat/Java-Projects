//handle the exception
//scanner class

import java.util.*;
class P17{
public static void main(String args[]){
System.out.println("Welcome");
Scanner s = new Scanner(System.in);
try{
	System.out.println("Enter a integer a: ");
	int a = s.nextInt();

	System.out.println("Enter a integer b: ");
	int b = s.nextInt();

	int res = a/b;
	System.out.println("res = " + res);
}catch(InputMismatchException e){
	System.out.println("u shud enter integers");
}catch(ArithmeticException e){
	System.out.println("2nd integer shud not be 0");
}
System.out.println("Bye");

}
}