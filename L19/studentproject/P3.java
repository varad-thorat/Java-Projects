import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

class P3{
public static void main(String args[]){
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;

try{
    s= sf.openSession();
    System.out.println("connected");
    
    List<Student> data = new ArrayList<>();
    data = s.createQuery("from Student").list();
    for(Student d: data)
        System.out.println(d);

}catch(Exception e){

    System.out.println("issue "+ e);
    
}finally{
    s.close();
    System.out.println("disconnected");
}
    
}
}