//wajp to read integer from the user
//check if the number is even or odd
//ISR and BR

import java.io.*;
class P2{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("Enter the number:");
int num = Integer.parseInt(br.readLine());
String res = num % 2 == 0 ? "even " : "odd";
System.out.println("res = "+ res);
}
}