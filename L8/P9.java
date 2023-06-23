// """  --> text block
// String can be declare using new as well as without new keyword

//wajp to declare and display Strings in java
//part 2

class P9{
public static void main(String args[]){
String s1 = "Kamal classes thane ";
//display 1
System.out.println(s1);

//display 2
for(int i = 0; i<s1.length(); i++){	//s1.length() = 5
	char ch = s1.charAt(i);
	System.out.print(ch);
}
System.out.println();
//display 3

char ch[] = s1.toCharArray();
for(char c : ch)
	System.out.print(c);

}
}
