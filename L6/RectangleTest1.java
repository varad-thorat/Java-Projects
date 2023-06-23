/*waoojp for class Rectangle

IV(instance variable)
	length,breadth;
IM(instance method)
	constructor
	show();
	area()
	perimeter()

constructor doesnt have any return type
method requires a return type
*/

class Rectangle{
private double length;
private double breadth;

Rectangle(double length , double breadth){
this.length = length;
this.breadth = breadth;
}

public void showRectangle(){
System.out.println(length + " " + breadth);
}

public void Area(){
double res = length * breadth;
System.out.println("res = "+ res);
}

public void Perimeter(){
double res = 2*(length + breadth);
System.out.println("res = "+ res);
}
}

class RectangleTest1{
public static void main(String args[]){
Rectangle r1 = new Rectangle(5.2,3.8);
r1.showRectangle();
r1.Area();
r1.Perimeter();
System.out.println();
Rectangle r2 = new Rectangle(3.5,6.5);
r2.showRectangle();
r2.Area();
r2.Perimeter();
}
}