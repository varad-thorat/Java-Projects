//wajp to read integer and
//print if its even or odd

class P10{
public static void main(String args[]){
int num = Integer.parseInt(args[0]);
String res = num % 2 == 0 ? "even":"odd";
System.out.println("res = "+ res);
}
}
