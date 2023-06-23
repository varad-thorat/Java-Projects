class Circle{
private double radius;

public void setData(double radius){
this.radius = radius;
}
public void showData(){
System.out.println("radius  = "+ this.radius);
}

public void area(){
double area = 3.14 * radius * radius;
System.out.println("area = "+area);
}

public void circum(){
double circum =  2 * 3.14 * radius;
System.out.println("circum = "+circum);
} 
}

class CircleTest{
public static void main(String args[]){
double radius = Double.parseDouble(args[0]);
Circle c = new Circle();
c.showData();
c.setData(radius);
c.showData();
c.area();
c.circum();

}
}