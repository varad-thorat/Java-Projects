//wajp to read marks of student and print grade
//m > 80 --> A	m > 60 --> B	m > 40 --> C	else --> D

class P14{
public static void main(String args[]){
int a = Integer.parseInt(args[0]);
if((a < 0) | (a>100))
	System.out.println("invalid marks");
else if (a>80)
	System.out.println("grade = A");
else if(a>60)
	System.out.println("grade = B");
else if(a>40)
	System.out.println("grade = C"); 
else
	System.out.println("grade = D");
}
}
