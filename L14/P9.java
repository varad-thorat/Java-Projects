// wajp to implement chatbot

import java.io.*;
import java.util.*;
class P9{
public static void main(String args[]){
Console c = System.console();

HashMap<String, String> conv = new HashMap<>();
conv.put("hi", "hello");
conv.put("hello", "hi");
conv.put("i love u", "welcome to the club");
conv.put("java", "july batch");
conv.put("fees", "Rs 12,000");
conv.put("phone", "7498405040 / 7303405040 / 02225405040");
conv.put("bye", "see u soon");
conv.put("om", "mittu");
conv.put("yeda", "paav");

while (true)
{
    String req = c.readLine("enter ur request and press q for quit ");
    if(req.equals("q"))
        break;
    else if(conv.get(req) != null){
        String res = conv.get(req);
        System.out.println(res);
    }else{
        System.out.println("sorry i dont understand");
    }    
}

}
}