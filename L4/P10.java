/*waoojp for class Circle
var: radius
method: 	setData()
		showData()
		area()
		circum()
*/

class Circle{
final double pi = 3.14;
double radius;

void setData(double r){
radius = r;
}

void showData(){
System.out.println("radius = "+ radius);
}

void area(){
double area = pi*radius*radius;
System.out.println("area = " + area );
}

void circum(){
double circum = 2*pi*radius;
System.out.println("circumference  = " + circum );
}
}

class P10{
public static void main(String args[]){
double r = Double.parseDouble(args[0]);

Circle c = new Circle();
c.setData(r);
c.showData();
c.area();
c.circum();

}
}
