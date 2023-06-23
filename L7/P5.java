//wajp to read array of Strings from the user
//and display in reverse alphabetical order

import java.util.*;
import java.io.*;
class P5{
public static void main(String args[]){

Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter the number of elements : "));
String data[] = new String[n];


//traditional for loop
for(int i = 0; i<n; i++){
	data[i] = c.readLine("enter the string: ");
}

Arrays.sort(data,Collections.reverseOrder());


for(String d : data)
	System.out.println(d);


}

}