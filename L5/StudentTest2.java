//this is used :
//if instance variable and local variable is same
//class contains instance variables
//method contains local variables

class Student{
int rno;
String name;

void setData(int rno, String name){
this.rno = rno;
this.name = name;
}
void showData(){
System.out.println("name  = "+ name);
System.out.println("rno  = "+ rno);
}
}

class StudentTest2{
public static void main(String args[]){
Student s1 = new Student();
s1.showData();
s1.setData(10, " Varad");
s1.showData();


}
}