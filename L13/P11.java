//wajp to read list of numbers from the user
// print the lowest and highest marks

import java.io.*;
import java.util.*;

class P11{
public static void main(String args[]){
Console c = System.console();
ArrayList<Double> data = new ArrayList<>();

String res = c.readLine("wud u like to enter names :  y/n : ");
while(res.equals("y")){
	Double num = Double.parseDouble(c.readLine("Enter numbers : "));
	data.add(num);
	res = c.readLine("wud u like to enter more marks :  y/n : ");
}
System.out.println("data : " + data);
Collections.sort(data);
System.out.println("lowest  = " + data.get(0) + "	highest = " + data.get(data.size() - 1));
}
}