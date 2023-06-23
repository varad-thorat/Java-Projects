//write matlab old data gaya naya data aya
//append matlab old data + naya data

// fw -> bw -> pw(print writer)
//wajp to write into an existing file

import java.io.*;
class P4{
public static void main(String args[]){
Console c = System.console();
String filename = c.readLine("enter filename : ");
File f = new File(filename);

if(f.exists()){
    try{
    FileWriter fw = new FileWriter(f);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter pw = new PrintWriter(bw);
    String data = c.readLine("enter data to write : ");
    pw.println(data);
    pw.close();
    }catch(IOException e){
        System.out.println("issue + "+ e);
    }
}else{
    System.out.println(filename + " does not exists");
}
}
}