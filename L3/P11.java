// wajp to read rating between 1 to 5 and print msg
// if rating is 5 --> excellent ,
// if rating is 3 or 4 msg --> good
//else msg --> ok
//we can write default anywhere in the code but generally we write it last
class P11{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
switch(num){
case 5 ->	System.out.println("excellent");
case 3,4->	System.out.println("good");
case 2,1->	System.out.println("ok");
default->	System.out.println("invalid input");
}
}
}