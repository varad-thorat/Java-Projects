//wajp to connect and disconnect
//s1: import the library
import java.sql.*;

class P1{
public static void main(String args[]){
try{
    // s2: load the driver
    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    
    // s3: get the connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kc_25june22","root", "varad123");
    System.out.println("connected");
    
    //s4: close the connection
    con.close();
    System.out.println("closed");
} catch(SQLException e){
    System.out.println("issue "+ e);
}
}
}