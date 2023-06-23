//wajp to demo difference between String and StringBuffer
// String --> concat
// StringBuffer --> append

class P6{
public static void main(String args[]){
//when string is not changing frequently --> String			immutable
String s1 = new String("kamal");
s1 = s1.concat(" sir");
System.out.println(s1);

//when string is changing frequently 				mutable
//no need for constantly saving the value
StringBuffer s2 = new StringBuffer("kamal");
s2.append(" sir");
System.out.println(s2);

}
}