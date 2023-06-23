//interface

interface B{
void f1();
}

class C implements B{
public void f1(){
	System.out.println("Hello");
}
}

class P3{
public static void main(String args[]){
C c = new C();
c.f1(); 
}
}