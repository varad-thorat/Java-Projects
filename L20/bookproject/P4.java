import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*; 

class P4{
public static void main(String args[]){
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Transaction t = null;

//try with resources --> ARM (Automatic Resource Management)
try(Session s = sf.openSession();){
    System.out.println("connected");
    Console c = System.console();
    int id = Integer.parseInt(c.readLine("enter id "));
    Book b = (Book)s.get(Book.class, id);
    if(b == null){
        System.out.println(id + "does not exists");
    }else{
        t = s.beginTransaction();
        s.delete(b);
        t.commit();
        System.out.println("record deleted");
    }
    
    
}catch(Exception e){
    t.rollback();
    System.out.println("issue " + e);
}

}
}

