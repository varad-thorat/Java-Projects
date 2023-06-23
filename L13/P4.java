// wajp to perform sqrt;
// console class
// complex approach

//creating a function

import java.io.*;
class P4{
public static void Compute(double num) throws Exception{
	if(num>=0.0){
		System.out.println("ans = " + Math.sqrt(num));
	}else{
		throw new Exception("u shud enter number >=0 "); 
	}
}
public static void main(String args[]){

System.out.println("Welcome");
Console c = System.console();
try{
	double num = Double.parseDouble(c.readLine("Enter integer num : "));
	Compute(num);
}catch(NumberFormatException nfe){
	System.out.println("u shud enter integers only");
}catch(Exception e){
	System.out.println(e.getMessage());
}
System.out.println("Bye");
}
}