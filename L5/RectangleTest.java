/*waoojp for class for Rectangle
    state: length and breadth
    behaviour: setData(),showData(),area(),perimeter()
*/

class Rectangle{
private double length;
private double breadth;

public void setData(double length, double breadth){
this.length = length;
this.breadth = breadth;
}

public void showData(){
System.out.println("length = " + length);
System.out.println("breadth = " + breadth);
}

public void area(){
double area = 3.14 * length * breadth;
System.out.println("area = "+ area);
}

public void perimeter(){
double perimeter = 2 * (length+breadth);
System.out.println("perimeter = "+ perimeter);
}
}

class RectangleTest{
public static void main(String args[]){
double l = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
Rectangle r = new Rectangle();
r.setData(l, b);
r.showData();
r.area();
r.perimeter();
}
}