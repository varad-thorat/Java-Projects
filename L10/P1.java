//wajp to read a string and 
//print the length of the string
//with and without using length()

import java.io.*;
class P1{
public static void main(String args[]){
Console c = System.console();
String str = c.readLine("Enter a string : ");
int len1 = str.length();

//without length()
char ch[] = str.toCharArray();
int len2 = 0;
for(char d : ch)
	len2++;
System.out.println(len2);
}
}