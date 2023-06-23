//wajp for class Teacher
//states : id, name, address, salary

//superclass-> class from which other class is derived
//singlelevel inheritence

class Person{
private int id;
private String name;
private String ads;

public Person(int id, String name, String ads){
this.id = id;
this.name = name;
this.ads = ads;
}

public void show(){
System.out.println("id = "+ id);
System.out.println("name = "+ name);
System.out.println("ads = "+ ads);
}
}

//subclass -> class derived from superclass
class Teacher extends Person{
private double salary;

public Teacher(int id, String name, String ads, double salary){
super(id,name,ads);	//passes information to superclass and initializes
this.salary = salary;
}

public void show(){
super.show();
System.out.println("salary = " + salary);
}
}

class P5{
public static void main(String args[]){
Teacher t = new Teacher(10, " Varad", "khanda colony", 50000 );
t.show();
}
}