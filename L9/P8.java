//wajp to read a sb and count the number of letter and digits

import java.io.*;
class P8{
public static void main(String args[]){
Console c = System.console();
StringBuffer sb = new StringBuffer(c.readLine("Enter a string:  "));
int lc=0, dc=0;
for(int i =0; i < sb.length() ; i++){
	char ch = sb.charAt(i);
	if(Character.isLetter(ch))
		lc++;
	else if(Character.isDigit(ch))
		dc++;
}
System.out.println("letter = "+ lc + " digits = " + dc);

}
}