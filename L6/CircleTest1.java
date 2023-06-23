/*
waoojp for class Circle
SV:	pi
IV:	radius
IM:	constructor
	show
	area
	circumference
*/
//static use in creating variable is that only one memory is allocated which is 
//shared by all the other 
//good programming practice

class Circle{
private double radius;
private static double pi = 3.14;
public Circle(double radius){
this.radius = radius;
}

public void show(){
System.out.println("radius = " + radius);
}

public void area(){
double res = pi * radius * radius;
System.out.println("area = " + res);
}

public void circum(){
double res = 2*pi * radius;
System.out.println("circum = " + res);
}
}

class CircleTest1{
public static void main(String args[]){
Circle c = new Circle(2.3);
c.show();
c.area();
c.circum();
}
}