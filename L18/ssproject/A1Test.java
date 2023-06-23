import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class A1 extends JFrame{
Container c;
JLabel lblName, lblCompany, lblPackage;
JTextField txtName, txtCompany, txtPackage;
JButton btnSubmit;

A1(){
c = getContentPane();
c.setLayout(null);

lblName = new JLabel("enter name ");
txtName = new JTextField(10);
lblCompany = new JLabel("Company name ");
txtCompany = new JTextField(10);
lblPackage = new JLabel("enter package ");
txtPackage = new JTextField(10);
btnSubmit = new JButton("Submit");

Font f = new Font("Courier", Font.BOLD, 30);
lblName.setFont(f);
txtName.setFont(f);
lblCompany.setFont(f);
txtCompany.setFont(f);
lblPackage.setFont(f);
txtPackage.setFont(f);
btnSubmit.setFont(f);

lblName.setBounds(20, 40, 300 , 30);
txtName.setBounds(300, 40, 300 , 30);
lblCompany.setBounds(20, 140, 300 , 30);
txtCompany.setBounds(300, 140, 300 , 30);
lblPackage.setBounds(20, 240, 300 , 30);
txtPackage.setBounds(300, 240, 300 , 30);
btnSubmit.setBounds(300,340,300,40);

c.add(lblName);
c.add(txtName);
c.add(lblCompany);
c.add(txtCompany);
c.add(lblPackage);
c.add(txtPackage);
c.add(btnSubmit);

ActionListener a1 = (ae) -> {
    try    {
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           String url = "jdbc:mysql://localhost:3306/ss27june22";
           String un ="root";
           String pw ="varad123";
           Connection con = DriverManager.getConnection(url,un,pw);
           String name = txtName.getText();
           String company = txtCompany.getText();
           double pkg = Double.parseDouble(txtPackage.getText());
           
           String sql = "insert into student values(?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,name);
           pst.setString(2,company);
           pst.setDouble(3,pkg);
           pst.executeUpdate();
           JOptionPane.showMessageDialog(c,"thanks");
           con.close();
    } catch(SQLException e){
        JOptionPane.showMessageDialog(c, e);
    }
};
btnSubmit.addActionListener(a1);

setTitle("Success Stories App by VT");
setSize(800, 500);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class A1Test{
public static void main(String args[]){
A1 a = new A1();
}
}