//wajp to read rating between 1 to 5 and print the msg 
//5 --> excellent	4 or 3-->good	

class P4{
public static void main(String args[]){
int r = Integer.parseInt(args[0]);
if((r>5) | (r<0)){
System.out.println("invalid input");
}else if (r==5){
System.out.println("Excellent");
}else if ((r==4) | (r==3)){
System.out.println("good");
}else {
System.out.println("Ok");
}

}
}