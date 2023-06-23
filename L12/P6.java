// lambda expression
// interface ka shortcut implentation
// condition for lambda is that :
// single abstract method req. and can contatin any number of default method
// static,private , private static methods
// it is also called functional interface

interface Compute{
int add(int a, int b);
}

class P6{
public static void main(String args[]){
// here lambda exp directly creates an object 
// and also overrides using the below exp

// if writing return brackets are req
Compute c1 = (int a, int b) -> { return a+b; };
System.out.println(c1.add(5, 7));

//return likha to bhi chalega nahi likha to bhi chalega
Compute c2 = (int p, int q) -> p + q;
System.out.println(c2.add(5,7));

Compute c3 = (p, q) -> p + q;
System.out.println(c3.add(5,7));

Compute c4 = (a, b) -> a + b;
int res = c4.add(5, 7);
System.out.println("res = " + res);
}
}