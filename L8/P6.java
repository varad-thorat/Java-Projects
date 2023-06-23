//wajp to read a character and print if its a letter/digit/other char
//Character --> isXxx()

import java.io.*;
//import java.lang.*;
class P6{
public static void main(String args[]) {
Console c = System.console();

//always returns string there is no method of returning a char
String str = c.readLine("Enter the String:");
char ch = str.charAt(0);
//immutable --> needs to be saved

//you can either erase above line and write as (Character.isLetter(str.charAt(0)) 
if(Character.isLetter(ch)){
System.out.println( ch + " = Its a Letter");
}
else if(Character.isDigit(ch)){
System.out.println( ch + " = Its a Digit");
}
else{
System.out.println( ch + " = Its other char");
}
}
}