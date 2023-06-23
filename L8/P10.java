//wajp to read and display the number of letter / digits / other letters
//i/p :	Varad@123	ans : 5 3 1 	

import java.io.*;
class P10{
public static void main(String args[]){
Console c = System.console();
String str = c.readLine("Enter the String : ");

int c1 = 0, c2 = 0, c3 = 0;
for(int i = 0; i < str.length(); i++){
	char ch = str.charAt(i);
	if(Character.isLetter(ch))	c1++;
	else if(Character.isDigit(ch))	c2++;
	else				c3++;
}
System.out.println("Letters = "+ c1);
System.out.println("Digits = "+ c2);
System.out.println("Other Letters = "+ c3);
}
}
