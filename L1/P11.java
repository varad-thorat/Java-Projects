// wajp to find min of three numbers

class P11{
public static void main(String args[]){
double n1 = Double.parseDouble(args[0]);
double n2 = Double.parseDouble(args[1]);
double n3 = Double.parseDouble(args[2]);

//compare n1 and n2
double res1 = n1<n2 ? n1:n2;

//compare res1 and n3 
double res2 = res1<n3 ? res1:n3;

System.out.println("ans = " + res2);
}
}