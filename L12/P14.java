// using ISR and BR
// handle the exception

import java.io.*;
class P14{
public static void main(String args[]) throws IOException{
System.out.println("Welcome");

InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter Integer a : ");
	int a = Integer.parseInt(br.readLine());

	System.out.println("Enter Integer b : ");
	int b = Integer.parseInt(br.readLine());

	int res = a/b;
	System.out.println("res = "+ res);

System.out.println("Bye");
}
}