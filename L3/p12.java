// wajp to find the sum of first "n" +ve integers
// i/p : 5  => 1+2+3+4+5=15

class P12{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
if(num > 0){
	int i = 1;
	int sum = 0;
	while(i<=num){
		sum = sum + i;
		i = i + 1;
	}
	System.out.println("sum = " +sum);
}else{
System.out.println("invalid input");
}
}
}