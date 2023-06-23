//wajp to read array of integers from the user
//and print no. of +ve, no. of -ve , and no. of 0

import java.io.*;
class P3{
public static void main(String args[]){

Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter the number of elements : "));
int data[] = new int[n];


//traditional for loop
for(int i = 0; i<n; i++){
	data[i] = Integer.parseInt(c.readLine("enter the number:"));
}

int c1= 0, c2=0, c3=0;
// enhanced for loop or for each loop
for(int d : data){
	if(d > 0)	c1++;
	else if(d < 0)	c2++;
	else	c3++;
}
System.out.println("c1 = "  + c1 + " c2 = " + c2 + " c3 = " + c3);
}

}