//wajp to find factorial of given number 
//i/p: 3  => 1 * 2 * 3 = 6

class P14{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
if(num >= 0){
	int i = 1;
	int fact = 1;
	while(i <=num)
	{
		fact = fact * i;
		i++;
	}
	System.out.println("fact = "+ fact);
}else{
System.out.println("invalid input");
}
}
}
