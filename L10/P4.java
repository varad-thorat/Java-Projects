class Employee{
private int eid;
private String name;
private double salary;

public Employee(int eid , String name, double salary){
this.eid = eid;
this.name = name;
this.salary = salary;
}

public void show(){
System.out.println("eid= " + eid+" name= "+ name+ " salary= " + salary);
}
}

class SalesPerson extends Employee{
private double comm;

public SalesPerson(int eid, String name, double salary, double comm){
super(eid, name, salary);
this.comm = comm;
}

public void show(){
super.show();
System.out.println("comm = " + comm);
}
}

class P4{
public static void main(String args[]){
SalesPerson sp = new SalesPerson(10, "Varad", 5000, 10000);
sp.show();
}
}