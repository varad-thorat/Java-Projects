//waoojp for class Student:
//var : rno and name 
//methods: setData() and showData()

class Student{
int rno;
String name;

void setData(int r, String n){
rno = r;
name = n;
}

void showData(){
System.out.println(rno + " " + name);
}
}

class P7{
public static void main(String args[]){
Student s1 = new Student();
s1.setData(61 , " Varadtheboi");
s1.showData();

Student s2 = new Student();
s2.setData(33 , "OMtheboi");
s2.showData();
}
}
