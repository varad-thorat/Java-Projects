//overloading to add integers
//static method

class Compute{
public static void add(int a, int b){
int res = a + b;
System.out.println("res = "+ res);
}

public static void add(int a, int b, int c){
int res = a+b+c;
System.out.println("res = "+ res);
}

public static void add(int a, int b, int c,int d){
int res = a+b+c+d;
System.out.println("res = "+ res);
}
}

class ComputeTest3{
public static void main(String args[]){
Compute.add(10 , 2);
Compute.add(10 , 2, 8);
Compute.add(10 , 2, 8, 5);
}
}

//static --> class and object
//non static --> only object