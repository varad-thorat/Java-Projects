// wajp to perform sqrt;
// console class
// third approach

import java.io.*;
class P3{
public static void main(String args[]){

System.out.println("Welcome");
Console c = System.console();
try{
	double num = Double.parseDouble(c.readLine("Enter integer num : "));
	if(num>=0.0){
		System.out.println("ans = " + Math.sqrt(num));
	}else{
		throw new Exception("u shud enter number >=0 "); 
	}
}catch(NumberFormatException nfe){
	System.out.println("u shud enter integers only");
}catch(Exception e){
	System.out.println(e.getMessage());
}
System.out.println("Bye");
}
}