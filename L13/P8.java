//wajp to read list of marks from the user
// and count m>=80, m=> 60, and m=> 40 and remaining 
//<> is kown as generics

import java.io.*;
import java.util.*;

class P8{
public static void main(String args[]){
Console c = System.console();
ArrayList<Integer> marks = new ArrayList<>();

String res = c.readLine("wud u like to enter marks :  y/n : ");
while(res.equals("y")){
	int num = Integer.parseInt(c.readLine("enter marks :  "));
	marks.add(num);
	res = c.readLine("wud u like to enter more marks :  y/n : ");
}
int c1 = 0, c2= 0 , c3 = 0, c4=0; 
for(int d : marks){
	if(d>=80)		c1++;
	else if(d>=60)		c2++;
	else if(d>=40)		c3++;
	else			c4++;
}
System.out.println("marks  = " + marks);
System.out.println("80 and above  = " + c1 + "		60 and above =  " + c2 + "	40 and above =  " + c3 + " 	remaining = " + c4);

}
}