// wajp to demo concept of overloading
// here A contains 1 compute function
//whereas B contains 2 compute function -> 1. with square and 2. add
//Overloading means addition of functionality (addition of parameters)
//Overriding means changing of functionality (no addition of paramters/ same parameters)

class A{
void compute(double num){
double res = num * num;
System.out.println("square = " + res);
}
}

class B extends A{
void compute(double num1, double num2){
double add = num1 + num2;
System.out.println("addition = " + add);
}
}

class P7{
public static void main(String args[]){
A a = new A();
a.compute(6);

B b = new B();
b.compute(7);
b.compute(4,5);
}
}