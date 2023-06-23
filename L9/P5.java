//wajp to read two strings and check
//if they are anagrams
//two strings having same letters but different meaning
//silent and listen are anagrams	earth and heart are anagrams

//first sort the two string and compare them if same then anagrams otherwise not

import java.io.*;
import java.util.*;
class P5{
public static void main(String args[]){
Console c = System.console();
String s1 = c.readLine("Enter a string 1 : ");
String s2 = c.readLine("Enter a string 2 : ");
char c1[] = s1.toCharArray();
char c2[] = s2.toCharArray();

Arrays.sort(c1);
Arrays.sort(c2);

s1 = new String(c1);
s2 = new String(c2);

if(s1.equals(s2)){
System.out.println("they are anagrams");
}else{
System.out.println("they are not anagrams");
}
}
}