//overloading to add integers

class Compute{
public void add(int a, int b){
int res = a + b;
System.out.println("res = "+ res);
}

public void add(int a, int b, int c){
int res = a+b+c;
System.out.println("res = "+ res);
}
}

class ComputeTest1{
public static void main(String args[]){
Compute c = new Compute();
c.add(10 , 2);
c.add(10 , 2, 8);
}
}
