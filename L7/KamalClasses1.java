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

class KamalClasses1{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("enter rno.");
int r1 = Integer.parseInt(br.readLine());
System.out.println("enter name");
String n1 = br.readLine();
Student s1 = new Student(r1 , n1);
s1.display();

System.out.println("enter rno.");
int r2 = Integer.parseInt(br.readLine());
System.out.println("enter name");
String n2 = br.readLine();
Student s2 = new Student(r2, n2);
s2.display();


}
}