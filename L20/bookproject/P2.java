import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*; 

class P2{
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
    String title = c.readLine("enter Book title ");
    String author = c.readLine("enter Book author ");
    double price = Double.parseDouble(c.readLine("enter Book price "));
    Book b = new Book(id, title, author, price);
    t = s.beginTransaction();
    s.save(b);
    t.commit();
    System.out.println("record created");
    
}catch(Exception e){
    t.rollback();
    System.out.println("issue " + e);
}

}
}
