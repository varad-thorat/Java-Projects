//wajp to add two numbers supplied by user 

class P3{
public static void main(String args[]){
double n1 = Double.parseDouble(args[0]);
double n2 = Double.parseDouble(args[1]);
double res = n1 + n2;
System.out.println("res = "+ res);
System.out.printf("res = %.2f ", res);
}
}