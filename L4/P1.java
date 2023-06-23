//wajp to compare three integers
//and print the max of 3

class P1{
public static void main(String args[]){
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
if((a>b)&&(a>c)){
System.out.println("max = "+ a);
}
else if((b>a)&&(b>c)){
System.out.println("max = "+ b);
}
else{
System.out.println("max = "+ c);
}
}
}
