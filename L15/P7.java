//wajp to make a copy of an existing file
// filewriter can also create a file so createnewfile need not be compulsory
import java.io.*;
class P8{
public static void main(String args[]){
Console c = System.console();

String srcFileName = c.readLine("enter source filename : ");
File srcf = new File(srcFileName);
if(srcf.exists()){
    try{
        
        String destfilename = c.readLine("enter dest filename: ");
        File destf = new File(destfilename);
        
        FileInputStream fis = new FileInputStream(srcf);
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        FileOutputStream fos = new FileOutputStream(destf);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        //code to copy
        int len = bis.read();
        while (len != -1){
            bos.write(len);
            len = bis.read();
        }
                    
        bis.close();
        bos.close();    
    }catch(IOException e ){
        System.out.println("issue" + e);
    }
}else{
    System.out.println( srcFileName + " does not exists");
}


}
}