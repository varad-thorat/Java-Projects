//wajp to read list of numbers from the user
// print sum and avg 

import java.io.*;
import java.util.*;

class P10{
public static void main(String args[]){
Console c = System.console();
ArrayList<Double> data = new ArrayList<>();

String res = c.readLine("wud u like to enter names :  y/n : ");
while(res.equals("y")){
	Double num = Double.parseDouble(c.readLine("Enter numbers : "));
	data.add(num);
	res = c.readLine("wud u like to enter more marks :  y/n : ");
}
double sum = 0.0; 
for(double d : data){
	sum = sum + d;
}
double avg = sum/(data.size());
System.out.println("data  = " + data);

System.out.println("sum  = " + sum);
System.out.println("avg  = " + avg);

}
}