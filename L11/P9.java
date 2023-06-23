// interface modifications
// default and private methods 
// java 8 modifications

//default methods --> method having body in interface and can be overrided(kiya to bhi chalega nahi kiya to bhi chalega))
//private methods --> method having body in interface and cannot be seen outside the interface

interface A{
void m();
default void n(){
System.out.println("Hi Lombdya");
}
}

class B implements A{
public void m(){
System.out.println("Hello Lombdya");
}
}

class C implements A{
public void m(){
	System.out.println("Hey Lombdya");
}
public void n(){
	System.out.println("Byee");
}
}

class P9{
public static void main(String args[]){
B b = new B();		b.m();	b.n();
C c = new C();		c.m();	c.n();
}
}
