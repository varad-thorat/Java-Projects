/*waoojp for class Rectangle
var: length and breadth
methods: setData(), area(), perimeter(), showData()
*/

class Rectangle{
double length, breadth;

void setData(double l,double b){
length = l;
breadth = b;
}

void showData(){
System.out.println(length + " " + breadth);
}

void area(){
double area = length *breadth;
System.out.println("area = " + area);
}

void perimeter(){
double perimeter = 2 * (length + breadth);
System.out.println("peri = " + perimeter);
}
}

class P9{
public static void main(String args[]){
double l = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);

//constructor
Rectangle r = new Rectangle();
r.setData(l,b);
r.showData();
r.area();
r.perimeter();
}
}