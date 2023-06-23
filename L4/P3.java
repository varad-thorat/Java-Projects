//wajp to find the fact of integers
// using do while loop

class P3{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
if(num>=0){
	double i = 1, fact = 1;
	do{
		fact = fact*i;
		i++;
	}while(i<=num);
	System.out.println("fact = "+ fact);
}else{
System.out.println("invalid input");
}
}
}