import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*; 

class P3{
public static void main(String args[]){
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Transaction t = null;

//try with resources --> ARM (Automatic Resource Management)
try(Session s = sf.openSession();){
    
    System.out.println("connected");
    List<Book> data = new ArrayList<>();
    data = s.createQuery("from Book").list();
    for(Book d: data)
        System.out.println(d.getId() + " " + d.getTitle() + " " + d.getAuthor()+ " " + 
        d.getPrice());
        
    }catch(Exception e){
    
    System.out.println("issue " + e);
}

}
}

