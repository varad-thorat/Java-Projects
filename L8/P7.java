//cla --> jdk 1.1 
//isr and br --> jdk 1.1
//Scanner --> jdk 1.5
//Console --> jdk 1.6

//array size cannot be negative
//if array size given -ve then error : Negative array sizeException
//wajp to read "n" marks from user and print avg marks

import java.io.*;
class P7{
public static void main(String args[]){
Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter the value of n: "));

if(n>0){
	int marks[] = new int[n];//declaration of array
	for(int i = 0; i<n; i++){
		marks[i] = Integer.parseInt(c.readLine());
	}
	double sum = 0.0;
	for(int m : marks)
		sum = sum + m;
	double avg = sum / n;
	System.out.println("avg = " + avg);
}else{
	System.out.println("invalid array size");
}
}
}