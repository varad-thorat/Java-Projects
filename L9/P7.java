//wajp to read SB from the user 
//and print on the screen

import java.io*;
class P7{
public static void main(String args[]){
Console c = System.console();
StringBuffer sb = new StringBuffer(c.readLin("Enter a string"));

System.out.println(sb);

for(int i = 0; i<sb.length(); i++){
	System.out.println(sb.charAt(i));
}

}
}


