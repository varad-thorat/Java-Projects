//wajp to read integer from the user and print the square root
//Math class --> sqrt()
//sqrt is not -ve 

import java.io.*;
class P5{
public static void main(String args[]) {
Console c = System.console();

double num = Double.parseDouble(c.readLine("Enter the number:"));
if(num > 0){
double res = Math.sqrt(num);
System.out.printf("res = %.2f", res);
} 
else{
System.out.println("invalid input");
}

}
}