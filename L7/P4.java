//wajp to read array of integers from the user
//and print array in ascending order

import java.util.*;
import java.io.*;
class P4{
public static void main(String args[]){

Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter the number of elements : "));
int data[] = new int[n];


//traditional for loop
for(int i = 0; i<n; i++){
	data[i] = Integer.parseInt(c.readLine("enter the number:"));
}

Arrays.sort(data);
for(int d : data){
System.out.println(d);
}

}
}