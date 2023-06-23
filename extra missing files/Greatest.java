public class Greatest {
public static void main(String args[]){
	System.out.println("Enter first num");
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int z = Integer.parseInt(args[2]);
if(x>y && x>z){
System.out.println("The largest Number is: "+x);
}
else if(y>z){
System.out.println("The largest Number is: "+y);
}
else{
System.out.println("The largest NUmber is: "+z);
}
}
}