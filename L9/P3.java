//wajp to read a string and count 
//number of lowercase, uppercase,digits and other char

import java.io.*;
class P3{
public static void main(String args[]){
Console c = System.console();
String str = c.readLine();
int lc = 0, uc = 0 , dc = 0, oc = 0;

for(int i = 0; i < str.length(); i++){
	char ch = str.charAt(i);
	if(Character.isLowerCase(ch))
		lc++;
	else if(Character.isUpperCase(ch))
		uc++;
	else if(Character.isDigit(ch))
		dc++;
	else
		oc++; 
}
System.out.println(lc + " "+ uc + " " + dc + " " + oc );

}
}