//wajp to read list of marks from the user
// and count m>=80, m=> 60, and m=> 40 and remaining 
//<> is kown as generics

import java.io.*;
import java.util.*;

class P8{
public static void main(String args[]){
Console c = System.console();
ArrayList<String> names = new ArrayList<>();

String res = c.readLine("wud u like to enter names :  y/n : ");
while(res.equals("y")){
	String name = c.readLine("Enter names : ");
	names.add(name);
	res = c.readLine("wud u like to enter more marks :  y/n : ");
}
Array.sort(names);
System.out.println("names  = " + names);
}
}