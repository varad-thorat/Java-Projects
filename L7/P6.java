//wajp to read array of numbers from the user
//and print the lowest and highest element

import java.util.*;
import java.io.*;
class P6{
public static void main(String args[]){

Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter the number of elements : "));
double data[] = new double[n];


//traditional for loop
for(int i = 0; i<n; i++){
	data[i] = Integer.parseInt(c.readLine("enter the number: "));
}

Arrays.sort(data);

System.out.println("lowest element = " + data[0]);
System.out.println("highest element = " + data[n-1]);
}

}