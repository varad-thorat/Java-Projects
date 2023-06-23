//wajp to implement Data Structure : queue/ fifo
//first in first out
//enqueue
//dequeue

import java.io.*;
import java.util.*;

class P4{
public static void main(String args[]){
Console c = System.console();
ArrayList<Integer> queue = new ArrayList<>();

while(true){
    int op = Integer.parseInt(c.readLine("1. enqueue    2.dequeue    3.display    4.exit :"));
    if(op == 1){
        int ele = Integer.parseInt(c.readLine("enter ele to enqueue : "));
        queue.add(ele);
        System.out.println(ele + " is enqueued in queue");
    }else if(op == 2){
        if(queue.size()==0){
            System.out.println("queue is empty");
        }else{
            int ele = queue.remove(0);
            System.out.println(ele + " is dequeued ");
        }
    
    }else if(op == 3){
        System.out.println(queue);
    }else if(op == 4){
        break;
    }
}//end of while loop

}//end of main 
}//end of class
