//wajp to Update the records
//s1: import the library
import java.sql.*;
import java.io.*;
class P4{
public static void main(String args[]){
try{
    // s2: load the driver
    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    
    // s3: get the connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kc_25june22","root", "varad123");
    System.out.println("connected");
    
    String sql = "update student set name = ? where rno = ?";
    PreparedStatement pst = con.prepareStatement(sql);
    Console c = System.console();
    int rno = Integer.parseInt(c.readLine("enter rno "));
    String name = c.readLine("enter name ");
    pst.setString(1, name);
    pst.setInt(2, rno);
    
    int r = pst.executeUpdate();
    if(r == 1)
        System.out.println("record updated");
    else
        System.out.println("record does not exists");
    //s4: close the connection
    con.close();
    System.out.println("closed");
} catch(SQLException e){
    System.out.println("issue "+ e);
}
}
}


