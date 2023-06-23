//waoojp for class student

class Student{
private int rno;
private String name;
private int p, c, m;

public void setData(int rno, String name, int p,int c,int m){
this.rno = rno;
this.name = name;
this.p = p;
this.c = c;
this.m = m;
}

public void showData(){
System.out.println(rno + " "+ name + " " + p + " " + c + " " + m);
}

public void findAvg(){
int avg = p + c + m;
double res = avg / 3;
System.out.println("res = "+ res);
}
}

class StudentTest1{
public static void main(String args[]){
Student s1 = new Student();
s1.setData(10,"biptya",70,80,90);
s1.showData();
s1.findAvg();

Student s2 = new Student();
s2.setData(03,"bipti",50,80,40);
s2.showData();
s2.findAvg();
}
}