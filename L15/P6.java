//write matlab old data gaya naya data aya
//append matlab old data + naya data

// fr -> br
//wajp to append into an existing file

import java.io.*;
class P6{
public static void main(String args[]){
Console c = System.console();
String filename = c.readLine("enter filename : ");
File f = new File(filename);

if(f.exists()){
    try{
        FileReader fr = new FileReader(f); 
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }catch(IOException e){
        System.out.println("issue + "+ e);
    }
}else{
    System.out.println(filename + " does not exists");
}
}
}