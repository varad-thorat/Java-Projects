//wajp to create a text File 
// File class present in java.io.*
// it contains methods as
// exists()
// createnewfile()
// delete()
import java.io.*;
class P2{
public static void main(String args[]){
Console c = System.console();
String filename = c.readLine("enter filename = ");
File f = new File(filename);

if(f.exists()){
    System.out.println(filename + " already exists" );
}else{
    try{
    f.createNewFile();
    System.out.println(filename + "created");
    }catch(IOException e){        //this will occur when space is less or permission is not given
    System.out.println("issue " + e );
    }
}
}
}