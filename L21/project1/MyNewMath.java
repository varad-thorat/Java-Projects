package pb;
class MyMath{
public void squareroot(double num){
double res = Math.sqrt(num);
System.out.println("res = " + res);
}

public void EvenOdd(double num){
String res = num % 2 ==0 ? "even" : "odd";
System.out.println("res = " + res);
}
}