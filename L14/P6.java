//wajp to maintain the team names
//participation in IPL

import java.io.*;
import java.util.*;
class P6{
public static void main(String args[]){
Console c = System.console();
LinkedHashSet<String> tn = new LinkedHashSet<>();

while(true){
    int op = Integer.parseInt(c.readLine("1.create    2.view    3.remove    4.exit"));
    switch(op){
        case 1 :     {
                        String name = c.readLine("enter team name: ");
                        if(tn.add(name))
                            System.out.println(name + " added");
                        else
                            System.out.println(name + " already exists");
                       
                      }
                      break;
                      
        case 2 :     System.out.println(tn);
                     break;
        
        case 3 :     {
                        String name = c.readLine("enter team name: ");
                        if(tn.remove(name) )
                            System.out.println(name + " removed");
                        else
                            System.out.println(name + " does not exists");        
                      } 
                      break;
                      
         case 4 :     break;
         
         default :    System.out.println("i dont understand"); 
                         break;                            
    }    
}

}
}
