//wajp to read username and password
//if username is kamal and password is classes then o/p
//success else failure
//readPassword only used if written in new String()

import java.io.*;
class P12{
public static void main(String args[]){
Console c = System.console();
String s1 = new String(c.readLine("Enter the username: "));
String s2 = new String(c.readPassword("Enter the password: "));

if((s1.equals("Varad")) && (s2.equals("admin"))){
	System.out.println("Success");
}else{
	System.out.println("Failure");
}

}
}