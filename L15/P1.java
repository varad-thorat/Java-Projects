//collection framework
//java ka readymade data structure
//list - arraylist and vector
//set - HashSet    LinkedHashSet    TreeSet
//Map - HashMap    LinkedHashMap    TreeMap

//list - duplicate data
//set and map - unique data
//map - key-value pair

// wamdjp to maintain TreeMap of Student

import java.io.*;
import java.util.*;

class Student{
private int rno;
private String name;

public Student(int rno, String name){
this.rno = rno;
this.name = name;
}

public String toString(){
    return rno + " " + name;
}
}

class P1{
public static void main(String args[]){
Console c = System.console();
TreeMap<Integer, Student> data = new TreeMap<>();

while(true){
int op = Integer.parseInt(c.readLine("1.create, 2.read, 3.delete and 4.exit : "));

switch(op){
    case 1 :    {
                    int rno = Integer.parseInt(c.readLine("enter rno: "));
                    if(data.get(rno) == null){
                        String name = c.readLine("enter name : ");
                        Student s = new Student(rno,name);
                        data.put(rno,s);
                        System.out.println(rno + " added");
                    }else{
                        System.out.println(rno + " already exists" );
                    }    
                 }
                 break;
    case 2 :    {
                    for(Map.Entry<Integer, Student> entry : data.entrySet()){
                        Integer key = entry.getKey();
                        Student value = entry.getValue();
                        System.out.println(key + " => " + value);
                    }
                 }
                 break;
    case 3 :   {
                    int rno = Integer.parseInt(c.readLine("enter rno: "));
                    if(data.get(rno) != null){
           
                        data.remove(rno);
                        System.out.println(rno + " removed");
                    }else{
                        System.out.println(rno + " does not exists" );
                    } 
                 }
                 break;
      case 4 :     System.exit(0);
                      break;       
      default :    System.out.println("i dont understand");
                      break;
}    
}
}
}