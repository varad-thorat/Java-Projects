//wajp to read a string 
//and sort in alphabetical order
//i/p: tina 	aint
//i/p: kamal 	aaklm

import java.io.*;
import java.util.*;
class P4 {
public static void main(String args[]){
Console c = System.console();
String str = c.readLine("Enter a String : ");

//string to char array
char ch[] = str.toCharArray();

//sort
Arrays.sort(ch);

//convert char array to string
str = new String(ch);
System.out.println("string = " + str);


}
}