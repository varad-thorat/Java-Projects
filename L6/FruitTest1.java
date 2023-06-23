/*waoojp for class fruit

IV
	name,color;
IM
	constructor
	show()

constructor doesnt have any return type
method requires a return type
*/

class Fruit{
private String name;
private String color;

Fruit(String name , String color){
this.name = name;
this.color = color;
}

public void showFruit(){
System.out.println(name + " " + color);

}
}

class FruitTest1{
public static void main(String args[]){
Fruit f1 = new Fruit("amba","piwla");
f1.showFruit();

Fruit f2 = new Fruit("mausambi","hirva");
f2.showFruit();
}
}