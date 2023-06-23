//wajp to read list of integers and create two list
//even_data and odd_data

import java.io.*;
import java.util.*;

class P2{
public static void main(String args[]){
Console c = System.console();
ArrayList<Integer> data = new ArrayList<>();
ArrayList<Integer> even_data = new ArrayList<>();
ArrayList<Integer> odd_data = new ArrayList<>();

String res = c.readLine("do u want to enter some data y/n : ");

while(res.equals("y")){
    int d = Integer.parseInt(c.readLine("enter integer: "));
    data.add(d);
    res = res = c.readLine("do u want to enter some data y/n : ");
}

for(int d : data){
    if(d%2 == 0)    even_data.add(d);
    else            odd_data.add(d);
}

System.out.println("data = " + data);
System.out.println("even data = " + even_data);
System.out.println("odd data = " + odd_data);


}
}