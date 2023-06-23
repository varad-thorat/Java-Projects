// wajp to perform ans = a/b;
// console class

import java.io.*;
class P1{
public static void main(String args[]){

System.out.println("Welcome");
Console c = System.console();
try{
	int a = Integer.parseInt(c.readLine("Enter integer a : "));
	int b = Integer.parseInt(c.readLine("Enter integer b : "));
	System.out.println("ans = " + (a/b));
}catch(NumberFormatException e){
	System.out.println("u shud enter integers only");
}catch(ArithmeticException e){
	System.out.println("2nd integer shud not be 0");
}
System.out.println("Bye");
}
}