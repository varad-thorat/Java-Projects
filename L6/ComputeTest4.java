//overloading to add integers
//static method
//adds any number of integers
// (...) known as variable arguments takes any arguments provided by user
// and then stores in 'n'
// n is then pointing to 'd' where the arguments are stored
  

class Compute{
public static void add(int ... n){
int res = 0;
for (int d : n){
	res = res + d;
}
System.out.println("res = "+ res);
}
}

class ComputeTest4{
public static void main(String args[]){
Compute.add(10 , 2);
Compute.add(10 , 2, 8);
Compute.add(20,62,45,48);
}
}

//static --> class and object
//non static --> only object