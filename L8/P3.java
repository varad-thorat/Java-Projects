//wajp to read integer from the user
//check if the number is even or odd
//Scanner class

import java.util.*;
class P3{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number:");
int num = sc.nextInt();
String res = num % 2 == 0 ? "even " : "odd";
System.out.println("res = "+ res);
}
}