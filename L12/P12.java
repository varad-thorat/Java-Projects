// try with multi-catch (Java 7)
//Exception -> it is a runtime error
// Handling --> to prevent abnormal termination
// try --> code that might cause an exception
// catch -> code to handle the exception

class P12{
public static void main(String args[]){
System.out.println("Welcome");

try{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
System.out.println("res = " + (a/b));
}catch(ArrayIndexOutOfBoundsException | NumberFormatException  e){
	System.out.println("u should supply two integers");
}catch(ArithmeticException e){
	System.out.println("2nd integer need not be 0");
}

System.out.println("Bye");

}
}