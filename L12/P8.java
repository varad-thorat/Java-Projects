interface MyMath{
double sqrt(double num);
}

class P8{
public static void main(String args[]){

MyMath m1 = (double num) -> {return Math.sqrt(num); };
System.out.println("sqrt = "+ m1.sqrt(4.0));

//type 2
MyMath m2 = num -> Math.sqrt(num); 
System.out.println("sqrt = "+ m2.sqrt(4.0));

MyMath m3 = (num) -> Math.sqrt(num); 
System.out.println("sqrt = "+ m3.sqrt(4.0));

}
}