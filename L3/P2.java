// wajp to read radius from the user
// and print area and the circum of circle
// data validations
class P2{
public static void main(String args[]){
double r = Double.parseDouble(args[0]);
final double pi = 3.14;
if (r > 0){
	double area = pi * r * r;
	double circum = 2 * pi * r;
	System.out.println("area = " + area );
	System.out.println("circum = " + circum );
}else{
	System.out.println("invalid radius" );
}
}
}