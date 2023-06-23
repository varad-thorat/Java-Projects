//wajp to read array of integers from the user
//and print on the screen

import java.io.*;
class P1{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("Enter the number of elements : ");
int n = Integer.parseInt(br.readLine());
int data[] = new int[n];


//traditional for loop
for(int i = 0; i<n; i++){
	System.out.println("enter the number:");
	data[i] = Integer.parseInt(br.readLine());
}



// enhanced for loop or for each loop
for(int d : data){
	System.out.println(d);
}
}
}