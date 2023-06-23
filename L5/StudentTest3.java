//strong encapsulation
//make datatype private
//make method public

class Student{
private int rno;
private String name;

public void setData(int rno, String name){
this.rno = rno;
this.name = name;
}
public void showData(){
System.out.println("name  = "+ name);
System.out.println("rno  = "+ rno);
}
}

class StudentTest3{
public static void main(String args[]){
Student s1 = new Student();
s1.showData();
s1.setData(10, " Varad");
s1.showData();


}
}