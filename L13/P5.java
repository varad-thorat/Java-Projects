//wajp to OOP + ExceptionHandling  + data validation
// new method introduced here toString method instead of 
// Show or display (i.e  s.show or s.display)
//


import java.io.*;
class Student{
private int rno;
private String name;
private int marks;

public Student (int rno , String name, int marks){
this.rno = rno;
this.name = name;
this.marks = marks;
}

public String toString(){
	return rno + " " + name + " " + marks;
}
}

class P5{


public static void main(String args[]){
System.out.println("Welcome");

Console c = System.console();
try{
String r = c.readLine("Enter rno : ");
int rno = Integer.parseInt(r);

String name = c.readLine("Enter name : ");
if(! (name.matches("[a-zA-Z ]+")))	//a-zA-Z is called regex i.e regular expression
{
	throw new Exception("u shud enter String only");
}

String m = c.readLine("Enter marks : ");
int marks = Integer.parseInt(m);
if(marks<0 || marks>100){
	throw new Exception("marks shud be between 0 and 100");
}
Student s = new Student(rno , name, marks);
System.out.println(s);
// you can also write it as -> System.out.println(s.toString());
}catch(NumberFormatException e){
	System.out.println("Integers only");
}catch(Exception e){
	System.out.println(e.getMessage());
}
System.out.println("Bye");
}
}
