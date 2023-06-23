//wajp to read a sb and count the number of vowels and consonants

import java.io.*;
class P9{
public static void main(String args[]){
Console c= System.console();
StringBuffer sb = new StringBuffer(c.readLine("Enter a string : "));

int vc=0, cc=0;
for(int i = 0; i<sb.length(); i++){
	char ch = sb.charAt(i);
	if(Character.isLetter(ch)){
	switch(ch){
		case 'a','e','i','o','u','A','E','I','O','U'->	vc++;
		default	->cc++;
	}
}
System.out.println("vowels = "+ vc + " consonants = " + cc);
}
}