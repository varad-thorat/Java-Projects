//wajp to read integer and print 
// if its even or odd 
// switch

class P7{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
switch(num%2){
case 0 ->	System.out.println("even");
case 1,-1 ->	System.out.println("even");
}
}
}