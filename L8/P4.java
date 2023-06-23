//wajp to read integer from the user
//check if the number is even or odd
//console class

import java.io.*;
class P4{
public static void main(String args[]) {
Console c = System.console();
//Console c = new Console(); --> private access

int num = Integer.parseInt(c.readLine("Enter the number:"));
String res = num % 2 == 0 ? "even " : "odd";
System.out.println("res = "+ res);
}
}