// try with multiple catch

class P11{
public static void main(String args[]){
System.out.println("Welcome");

try{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
System.out.println("res = " + (a/b));
}catch(ArrayIndexOutOfBoundsException e){
	System.out.println("u should supply two integers");
}catch(NumberFormatException e){
	System.out.println("u should supply integers only");
}catch(ArithmeticException e){
	System.out.println("2nd integer need not be 0");
}

System.out.println("Bye");

}
}