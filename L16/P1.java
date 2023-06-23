//wajp to save and restore the data entered 

import java.io.*;
import java.util.*;

class Employee implements Serializable{
private int eid;
private String ename;

public Employee(int eid, String ename){
this.eid = eid;
this.ename = ename;
}

public String toString(){
    return "eid = " + eid + " ename = " + ename;
}
}

class P1{
public static void main(String args[]){
Console c = System.console();

File f = new File("stu.ser");
if(f.exists())
    restore();

while(true){
    int op = Integer.parseInt(c.readLine("1. create, 2.view, 3.remove and 4.exit"));
    switch(op){
        case 1 : {
                    int eid = Integer.parseInt(c.readLine("enter emp id"));
                    if(data.get(eid) != null){
                        System.out.println(eid + "already exists " );
                    }else{
                        String ename = c.readLine("enter emp name ");
                        Employee e = new Employee(eid, ename);
                        data.put(eid, e);
                        System.out.println(eid + "created" ); 
                    }
                    break;
         case 2 : {
                     for(Map.Entry<Integer, Employee> entry : data.entrySet())
                     {
                         int key = entry.getKey();
                         Employee value = entry.getValue();
                         System.out.println(key + " -> " + value);
                     }
                   }
                     break;
          case 3 : {
                      
                   }
                   break;  
          
          case 4 : {
                      save();
                      System.exit(0);
                   }
                   break;       
          default : {
                      System.out.println("i dont understand ");
                    }
                    break;
}
}
}

public static void save(){
    try{
        FileOutputStream fos = new FileOutputStream("stu.ser");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(data);
        oos.close();
    } catch(Exception e){
        System.out.println("issue " + e);
    }
}

public static void restore(){
    try{
        FileOutputStream fis = new FileOutputStream("stu.ser");
        BufferedOutputStream bis = new BufferedOutputStream(fis);
        ObjectOutputStream ois = new ObjectOutputStream(bis);
        ois.close();
    } catch(Exception e){
        System.out.println("issue " + e);
    }
}
