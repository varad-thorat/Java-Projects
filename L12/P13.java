// using ISR and BR
// handle the exception

import java.io.*;
class P13{
public static void main(String args[]){
System.out.println("Welcome");

InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
try{
	System.out.println("Enter Integer a : ");
	int a = Integer.parseInt(br.readLine());

	System.out.println("Enter Integer b : ");
	int b = Integer.parseInt(br.readLine());

	int res = a/b;
	System.out.println("res = "+ res);
}catch(IOException e){
	System.out.println("input issue " + e);
}
System.out.println("Bye");
}
}