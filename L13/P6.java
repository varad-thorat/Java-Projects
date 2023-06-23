//wajp to track on food ordered by A and KS

import java.io.*;
import java.util.*;

class P6{
public static void main(String args[]){
Console c = System.console();
ArrayList<String> foodList = new ArrayList<>();

String res = c.readLine("wud u like to order some food y/n : ");
while(res.equals("y")){
	String name = c.readLine("enter food name: ");
	foodList.add(name);
	res = c.readLine("wud u like to order more food y/n");	
}
System.out.println("Food Ordered = " + foodList);
}
}