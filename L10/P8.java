// wajp to demo concept of overloading
// here A contains 1 compute function -> square
//whereas B contains only 1 compute function -> sqroot
//but both have same name

class A{
void compute(double num){
double res = num * num;
System.out.println("square = " + res);
}
}

class B extends A{
void compute(double num){
double sqrt = Math.sqrt(num);
System.out.println("sqrt = " + sqrt);
}
}

class P8{
public static void main(String args[]){
A a = new A();
a.compute(6);

B b = new B();
b.compute(9);
}
}