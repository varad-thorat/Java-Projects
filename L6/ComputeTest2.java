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
}

class ComputeTest2{
public static void main(String args[]){
Compute.add(10 , 2);
Compute.add(10 , 2, 8);
}
}

//static --> class and object
//non static --> only object