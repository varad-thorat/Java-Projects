// wajp to read integer and print 
//if its even or odd

class P6{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
if(num % 2 == 0)
	System.out.println("even");
else
	System.out.println("odd");
}
}