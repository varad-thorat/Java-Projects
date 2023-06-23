// interface modifications
// private methods --> method having body in interface and cannot be used outside interface
/* below code cannot compile as private methods are not accessed outside the interface

interface M{
private int p(){
	System.out.println("p");
}
}

class P11{
public static void main(String args[]){
M m = new M();
m.p();
}
}
*/

/* in below code we are able to access private method outside using the default
method q() which can be accessed from outside. and we will then implement m().*/ 

interface M{
default void q(){
	p();
}

private void p(){
	System.out.println("p");
}
}

class N implements M{ }

class P11{
public static void main(String args[]){
N n = new N();
n.q();
}
}