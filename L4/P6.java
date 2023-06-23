//wajp to find the sum of 'n' +ve integers
//using for loop
// csi --> first condition is executed , then statement , then iteration
//part 2 

class P6{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
if(num > 0){
int sum = 0, i = 1;
for(;i<=num;){
	sum = sum + i;
	i++;
}
System.out.println("sum = "+sum);
}else{
System.out.println("invalid input");
}
}
}