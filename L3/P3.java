// wajp to read length and breadth
//print area and perimeter of rectangle
//data validations

class P3{
public static void main(String args[]){
double length = Double.parseDouble(args[0]);
double breadth = Double.parseDouble(args[1]);

if ((length> 0)& (breadth > 0)){
	double area = length * breadth;
	double peri = 2 * (length + breadth);
	System.out.println("area = "+ area);
	System.out.println("peri = "+ peri);
}
else{
	System.out.println("invalid input");
}
}


}