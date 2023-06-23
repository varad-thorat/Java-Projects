//wajp to view the records
//s1: import the library
import java.sql.*;
import java.io.*;
class P3{
public static void main(String args[]){
try{
    // s2: load the driver
    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    
    // s3: get the connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kc_25june22","root", "varad123");
    System.out.println("connected");
    
    String sql = "select * from student";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
        int rno = rs.getInt(1);
        String name = rs.getString(2);
        String msg = "rno " + rno + " name " + name;
        System.out.println(msg);
    }
    rs.close();
    //s4: close the connection
    con.close();
    System.out.println("closed");
} catch(SQLException e){
    System.out.println("issue "+ e);
}
}
}

