/*waoojp for class Employee
	sv(Static variable) => Company_name
	IV => id, name, salary
	IM => constructor and show()
	store all objects in an array*/

import java.io.*;
class Employee{
private static String cn = "KIT";
private int id;
private String name;
private double salary;

public Employee(int id, String name, double salary){
this.id = id;
this.name = name;
this.salary = salary;
}

public void show(){
System.out.println(id + " " + name + " " + salary);
}
}

class KamalClasses3{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Enter the number of employee");
int n = Integer.parseInt(br.readLine());
Employee data[] = new Employee[n];

for(int i = 0; i < n; i++){
System.out.println("enter id");
int id = Integer.parseInt(br.readLine());
System.out.println("enter name");
String name = br.readLine();
System.out.println("enter salary");
double salary = Double.parseDouble(br.readLine());
data[i] = new Employee(id,name,salary);
}
for(int i = 0 ; i < n ; i++){
data[i].show();
}
for(Employee d: data){
	d.show();
}
}
}