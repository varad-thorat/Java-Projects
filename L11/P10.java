// interface modification
//static methods --> methods in interface having body and cannot be overrided

interface P{
static void a(){
	System.out.println("a");
}
}

class P10{
public static void main(String args[]){
P.a();	//static belongs to class so no need to create object
}
}

