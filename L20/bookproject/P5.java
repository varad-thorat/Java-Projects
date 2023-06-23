import org.hibernate.*;
import org.hibernate.cfg.*;

class P5{
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
        String title = c.readLine("enter updated title ");
        String author = c.readLine("enter updated author ");
        double price = Double.parseDouble(c.readLine("enter updated price "));
        b.setTitle(title);
        b.setAuthor(author);
        b.setPrice(price);
        
        
        s.save(b);
        t.commit();
        System.out.println("record deleted");
    }
    
    
}catch(Exception e){
    t.rollback();
    System.out.println("issue " + e);
}

}
}

