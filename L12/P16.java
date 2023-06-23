//handle the exception
//scanner class

import java.util.*;
class P16{
public static void main(String args[]){
System.out.println("Welcome");
Scanner s = new Scanner(System.in);

System.out.println("Enter a integer a: ");
int a = s.nextInt();

System.out.println("Enter a integer b: ");
int b = s.nextInt();
int res = a/b;
System.out.println("res = " + res);

System.out.println("Bye");

}
}