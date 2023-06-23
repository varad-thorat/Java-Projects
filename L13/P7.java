//wajp to read list of numbers from the user and count 
// number of +ve, number of -ve and number of 0's
import java.io.*;
import java.util.*;

class P7{
public static void main(String args[]){
Console c = System.console();
ArrayList<Double> data = new ArrayList<>();

String res = c.readLine("wud u like to enter numbers :  y/n : ");
while(res.equals("y")){
	Double num = Double.parseDouble(c.readLine("enter number :  "));
	data.add(num);
	res = c.readLine("wud u like to enter more numbers :  y/n : ");
}
int c1 = 0, c2= 0 , c3 = 0; 
for(Double d : data){
	if(d>0)		c1++;
	else if(d<0)	c2++;
	else		c3++;
}
System.out.println("numbers  = " + data);
System.out.println("+ve  = " + c1 + "		-ve =  " + c2 + "	0's =  " + c3 );

}
}