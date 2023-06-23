interface MyMath{
void square(double num);
}

class P7{
public static void main(String args[]){
MyMath m1 = (double num) -> System.out.println("square = "+ (num*num));
m1.square(4.0);
}
}