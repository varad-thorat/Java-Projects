// wajp to read rating between 1 to 5 and print msg
// if rating is 5 --> excellent ,
// if rating is 3 or 4 msg --> good
//else msg --> ok
class P10{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
switch(num){
case 5 :	System.out.println("excellent");
		break;
case 3,4:	System.out.println("good");
		break;
case 2,1:	System.out.println("ok");
		break;
default:	System.out.println("invalid input");
}
}
}