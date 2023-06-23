//wajp to convert dollars into rupees

class P4{
public static void main(String args[]){
double dollars = Double.parseDouble(args[0]);
double rupees = 79 * dollars;
System.out.println("Dollars = " + dollars);
System.out.printf("Rupees = %.2f" , rupees);
}
}