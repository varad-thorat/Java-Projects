//abstract class

abstract class B{
abstract void f1();
}

class C extends B{
void f1(){
	System.out.println("Hello");
}
}

class P2{
public static void main(String args[]){
C c = new C();
c.f1();
}
}