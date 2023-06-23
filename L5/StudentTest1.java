class Student{
int rno;
String name;

void setData(int r, String n){
rno = r;
name = n;
}
void showData(){
System.out.println(rno +""+ name);
}
}

class StudentTest1{
public static void main(String args[]){
Student s1 = new Student();
s1.setData(10, "	Varad");
s1.showData();


}
}