//using array 
//reducing the line of code

import java.io.*;
class Student{
private static String pn = "Kamal Sir";
private int rno;
private String name;


public Student(int rno, String name){
this.rno = rno;
this.name = name;
}

public void display(){
System.out.println(rno + " " + name);
}
}

class KamalClasses2{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("Enter the number of students");
int n = Integer.parseInt(br.readLine());
Student data[] = new Student[n];
// array --> group of elements of same data type

for(int i=0; i<n; i++){
System.out.println("Enter rno.");
int r1 = Integer.parseInt(br.readLine());
System.out.println("Enter name");
String n1 = br.readLine();
data[i] = new Student(r1,n1);
}
for(int i = 0; i < n; i++){
data[i].display();
}
}
}