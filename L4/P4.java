//wajp to find the sum of 'n' +ve integers
//using for loop

class P4{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
if(num > 0){
int sum = 0;
for(int i = 1;i<=num;i++){
	sum = sum + i;
}
System.out.println("sum = "+sum);
}else{
System.out.println("invalid input");
}
}
}