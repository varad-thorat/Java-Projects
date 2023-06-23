//multilevel inheritence

class Da{
int m1 = 1000;
}

class Ma extends Da{
int m2 = 10000;
}

class Aa extends Ma{
void show(){
int res = m1 + m2;
System.out.println("res = " + res);
}
}

class P3{
public static void main(String args[]){
Aa a = new Aa();
a.show();
}
}