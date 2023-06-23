//waoojp for overloading area()
//	1)area -> of circle
//	2) area -> of rectangle

//STATIC METHOD
//overloading concept
//naam ek kaam anek 
//name of method

//static belong to CLASS and OBJECT 
//non static belongs to OBJECT

class Compute{
private double radius;
private double length;
private double breadth;

public static void area(double radius){
this.radius=radius;
double area = 3.14 * radius *radius;
System.out.println(" Circle area = "+ area);
}

public static void area(double length, double breadth){
this.length = length;
this.breadth = breadth;
double area = length * breadth;
System.out.println("Rectangle area = " + area);
}
}

class P3{
public static void main(String args[]){
double radius = Double.parseDouble(args[0]);
double length = Double.parseDouble(args[1]);
double breadth = Double.parseDouble(args[2]);

Compute.area(radius);
Compute.area(length , breadth);
}
}