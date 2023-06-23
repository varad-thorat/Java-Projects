// lambda expression
// interface ka shortcut implentation
// condition for lambda is that :
// single abstract method req. and can contatin any number of default method
// static,private , private static methods
// it is also called functional interface

interface Compute{
void add(int a, int b);
}

class P5{
public static void main(String args[]){
// here lambda exp directly creates an object 
// and also overrides using the below exp
Compute c1 = (int a, int b) -> System.out.println("addn = " + (a + b));
c1.add(10,20);

Compute c2 = (int p, int q) -> System.out.println("addn = " + (p + q));
c2.add(10,20);

//datatype is not necessary
Compute c3 = (p, q) -> System.out.println("addn = " + (p + q));
c3.add(10,20);

// {} are used in order to write multiline statements
Compute c4 = (p,q) -> { System.out.println("addn = " + (p + q)); };
c4.add(10,20);

Compute c5 = (p,q) -> { int res = p+q; System.out.println("addn = " + (p + q)); };
c5.add(10,20);


 
}
}