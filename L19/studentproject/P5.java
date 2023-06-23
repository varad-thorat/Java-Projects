import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class P5{
public static void main(String args[]){
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;
try{
    s= sf.openSession();
    System.out.println("connected");
    t= s.beginTransaction();
    
    Console c = System.console();
    int rno = Integer.parseInt(c.readLine("enter rno "));
    Student stu = (Student)s.get(Student.class, rno);
    if(stu == null){
        System.out.println(rno + " does not exists ");
    }else{
        s.delete(stu);
        t.commit();
        System.out.println("record deleted");
    }

}catch(Exception e){
    t.rollback();
    System.out.println("issue "+ e);
}finally{
    s.close();
    System.out.println("disconnected");
}
    
}
}