//wajp to read integer from the user
//check if the number is even or odd
//Scanner class

import java.util.*;
class P3{
public static void main(String args[]) {
Console c = System.console();

int num = Integer.parseInt(readLine("Enter the number:"));
String res = num % 2 == 0 ? "even " : "odd";
System.out.println("res = "+ res);
}
}