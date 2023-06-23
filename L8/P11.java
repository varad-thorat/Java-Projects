//wajp to read username and password
//if username is kamal and password is classes then o/p
//success else failure

import java.io.*;
class P11{
public static void main(String args[]){
Console c = System.console();
String s1 = c.readLine("Enter the username: ");
String s2 = c.readLine("Enter the password: ");

if((s1.equals("Varad")) && (s2.equals("admin"))){
	System.out.println("Success");
}else{
	System.out.println("Failure");
}

}
}