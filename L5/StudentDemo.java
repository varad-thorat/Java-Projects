/* waoojp for class Student
state:	rno, name and marks
behaviour:	setData(), showData(), findGrade()
	m>80 --> A,	m>60-->B,	else --> C
*/
class Student{
private int rno;
private int marks;
private String name;

public void setData(int rno, String name, int marks){
this.marks = marks;
this.rno = rno;
this.name= name;
}
public void showData(){
System.out.println("rno = "+ rno);
System.out.println("name = "+ name);
System.out.println("marks = "+ marks);
}
public void findGrade(){
if (marks > 0 && marks < 80){
	if(marks>80){
		System.out.println("grade A");
	}
	else if(marks>60){
		System.out.println("grade B");
	}
	else{
		System.out.println("grade C");
	}
}
else{
System.out.println("invaild marks");
}

}
}
class StudentDemo{
public static void main(String args[]){
int rno = Integer.parseInt(args[0]);
String name = args[1];
int marks = Integer.parseInt(args[2]);
Student s = new Student();
s.setData(rno,name,marks);
s.showData();
s.findGrade();

}
}







