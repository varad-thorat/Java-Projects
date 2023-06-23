// lambda expression
// interface ka shortcut implentation
// condition for lambda is that :
// single abstract method req. and can contatin any number of default method
// static,private , private static methods

interface B{
void f1();
}

class P4{
public static void main(String args[]){
B b = () -> System.out.println("Hello");
b.f1(); 
}
}