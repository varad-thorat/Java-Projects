// wajp to perform sqrt;
// console class
// second approach

import java.io.*;
class P2{
public static void main(String args[]){

System.out.println("Welcome");
Console c = System.console();
try{
	double num = Double.parseDouble(c.readLine("Enter integer num : "));
	if(num>=0.0){
		System.out.println("ans = " + Math.sqrt(num));
	}else{
		System.out.println("u shud enter number >=0 ");
	}
}catch(NumberFormatException e){
	System.out.println("u shud enter integers only");
}
System.out.println("Bye");
}
}