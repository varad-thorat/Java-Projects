//wajp to implement Data Structure : Stack/ Lifo
//last in first out
//push 
//pop

import java.io.*;
import java.util.*;

class P3{
public static void main(String args[]){
Console c = System.console();
ArrayList<Integer> stack = new ArrayList<>();

while(true){
    int op = Integer.parseInt(c.readLine("1. push    2.pop    3.display    4.exit :"));
    if(op == 1){
        int ele = Integer.parseInt(c.readLine("enter ele to push"));
        stack.add(ele);
        System.out.println(ele + " is pushed in stack");
    }else if(op == 2){
        if(stack.size()==0){
            System.out.println("stack is empty");
        }else{
            int ele = stack.remove(stack.size()-1);
            System.out.println(ele + "is popped ");
        }
    
    }else if(op == 3){
        System.out.println(stack);
    }else if(op == 4){
        break;
    }
}//end of while loop

}//end of main 
}//end of class