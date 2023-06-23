// wajp to demonstrate Arr List

import java.util.*;
class P1{
public static void main(String args[]){
ArrayList<Integer> d1 = new ArrayList<>();
System.out.println(d1);

//append
d1.add(10);    d1.add(20);    d1.add(30);    d1.add(40);
System.out.println(d1);

//insert
d1.add(1,40);
System.out.println(d1);
// d1.add(10, 88);    Index out of bounds

//replace
d1.set(2, 50);
System.out.println(d1);

//check 
System.out.println(d1.contains(40));
System.out.println(d1.contains(40));

}
}