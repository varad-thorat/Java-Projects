//wajp to find the fact of 'n' integers
//using for loop

class P5{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
if(num >= 0){
int fact = 1;
for(int i = 1;i<=num;i++){
	fact = fact * i;
}
System.out.println("fact = "+fact);
}else{
System.out.println("invalid input");
}
}
}