import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class P2{
public static void main(String args[]){
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;
try{
    s= sf.openSession();
    System.out.println("connected");
    
    Console c = System.console();
    int rno = Integer.parseInt(c.readLine("enter rno "));
    String name = c.readLine("enter name ");
    int marks = Integer.parseInt(c.readLine("enter marks "));
    Student stu = new Student(rno, name, marks);
    t = s.beginTransaction();
    s.save(stu);
    t.commit();
    System.out.println("record created ");

}catch(Exception e){
    t.rollback();
    System.out.println("issue "+ e);
}finally{
    s.close();
    System.out.println("disconnected");
}
    
}
}
