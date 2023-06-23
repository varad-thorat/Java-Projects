// try with single catch

class P10{
public static void main(String args[]){
System.out.println("Welcome");

try{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
System.out.println("res = " + (a/b));
}catch(Exception e){
	System.out.println("input issue " + e);
}
System.out.println("Bye");

}
}