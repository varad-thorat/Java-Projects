//wajp to read array of integers from the user
//and print on the screen

import java.io.*;
class P2{
public static void main(String args[]){

Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter the number of elements : "));
int data[] = new int[n];


//traditional for loop
for(int i = 0; i<n; i++){
	data[i] = Integer.parseInt(c.readLine("enter the number:"));
}



// enhanced for loop or for each loop
for(int d : data)
	System.out.println(d);
}

}