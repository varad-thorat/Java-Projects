//wajp to read a string and 
//check if its a palindrome 
// nitin, wow, lol, racecar, .....

import java.io.*;
class P2{
public static void main(String args[]){
Console c = System.console();
String str = new String(c.readLine("Enter a string : "));

//string chaining
String rev = new StringBuffer(str).reverse().toString();

if(rev.equals(str)){
	System.out.println("Its a palindrome");
}else{
	System.out.println("Its not a palindrome");
}
}
}