class Find{
static void max(int ... data){
int res = data[0];
for(int d : data){
	if(d > res)
		res = d;
}
System.out.println("res = " + res);
}
}

class FindTest{
public static void main(String args[]){
Find.max(10,20);
Find.max(5,6,9);

}
}