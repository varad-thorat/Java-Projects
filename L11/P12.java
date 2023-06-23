// private static --> same as private method

interface Mango{

default void n(){
	p();
}

private static void p(){
	System.out.println("p");
}
}

class N implements Mango{ }

class P12{
public static void main(String args[]){
N m = new N();
m.n();
}
}