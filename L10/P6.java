//wajp for class 
//states : id, name, address, salary
//multilevel inheritence

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

class Teacher extends Person{
private double salary;

public Teacher(int id, String name, String ads, double salary){
super(id,name,ads);
this.salary = salary;
}

public void show(){
super.show();
System.out.println("salary = " + salary);
}
}

class Hod extends Teacher{
private String dept;

public Hod(int id, String name, String ads, double salary, String dept ){
super(id,name,ads,salary);
this.dept = dept;
}

public void show(){
super.show();
System.out.println("dept = " + dept);
}
}

class Student extends Person{
private double marks;

public Student(int id, String name, String ads, double marks){
super(id,name,ads);
this.marks = marks;
}

public void show(){
super.show();
System.out.println("marks = " + marks);
}
}

class P6{
public static void main(String args[]){
Teacher t = new Teacher(1, " OM", "Panvel", 70000.05);
t.show();
System.out.println();
Hod h = new Hod(10, " Varad", "khanda colony", 60000, "IT" );
h.show();
System.out.println();
Student s = new Student(12, " VAndy", "Satara", 56.3 );
s.show();
}
}