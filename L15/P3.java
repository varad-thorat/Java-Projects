//wajp to delete a text File 
// File class present in java.io.*
// it contains methods as
// exists()
// createnewfile()
// delete()

import java.io.*;
class P3{
public static void main(String args[]){
Console c = System.console();
String filename = c.readLine("enter filename = ");
File f = new File(filename);

if(f.exists()){
    f.delete();
    System.out.println(filename + " deleted");
}else{
    System.out.println(filename + " does not exist");
    
}
}
}
