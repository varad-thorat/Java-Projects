//wajp to create a record
//s1: import the library
import java.sql.*;
import java.io.*;
class P2{
public static void main(String args[]){
try{
    // s2: load the driver
    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    
    // s3: get the connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kc_25june22","root", "varad123");
    System.out.println("connected");
    
    String sql = "insert into student values(?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);
    Console c = System.console();
    int rno = Integer.parseInt(c.readLine("enter rno "));
    String name = c.readLine("enter name ");
    pst.setInt(1, rno);
    pst.setString(2, name);
    pst.executeUpdate();
    System.out.println("record created");
    
    //s4: close the connection
    con.close();
    System.out.println("closed");
} catch(SQLException e){
    System.out.println("issue "+ e);
}
}
}
