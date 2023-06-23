//wajp to demo the concept of Maps

import java.util.*;
class P7{
public static void main(String args[]){
// unordered and unsorted
HashMap <String, Integer> menu1 = new HashMap<>();
menu1.put("idli", 50);    menu1.put("dosa", 70);
menu1.put("momo", 60);    menu1.put("idli", 80);
menu1.put("dosa", 90);
System.out.println(menu1);

//insertion order
LinkedHashMap<String, Integer> menu2 = new LinkedHashMap<>();
menu2.put("idli", 50);    menu2.put("dosa", 70);
menu2.put("momo", 60);    menu2.put("idli", 80);
menu2.put("dosa", 90);
System.out.println(menu2);

//sorted order of the keys
TreeMap<String, Integer> menu3 = new TreeMap<>();
menu3.put("idli", 50);    menu3.put("dosa", 70);
menu3.put("momo", 60);    menu3.put("idli", 80);
menu3.put("dosa", 90);
System.out.println(menu3);

}
}