
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class A1 extends JFrame{
Container c;
JLabel lblName, lblSelect;
JTextField txtName;
JCheckBox cbPython, cbJava, cbJavascript, cbCpp;
JButton btnSubmit;

A1(){
c = getContentPane();
c.setLayout(null);

lblName = new JLabel("enter name ");
txtName = new JTextField(10);
lblSelect = new JLabel("select all that u know ");
cbPython = new JCheckBox("Python");
cbJava = new JCheckBox("Java");
cbJavascript = new JCheckBox("JavaScript");
cbCpp = new JCheckBox("Cpp");
btnSubmit = new JButton("Submit");

Font f = new Font("Courier", Font.BOLD, 30);
lblName.setFont(f);
txtName.setFont(f);
lblSelect.setFont(f);
cbPython.setFont(f);
cbJava.setFont(f);
cbJavascript.setFont(f);
cbCpp.setFont(f);
btnSubmit.setFont(f);

lblName.setBounds(20, 40, 300 , 30);
txtName.setBounds(300, 40, 300 , 30);
lblSelect.setBounds(20, 100, 600 , 30);
cbPython.setBounds(300, 140, 150 , 30);
cbJava.setBounds(500, 140, 150 , 30);
cbJavascript.setBounds(500,200,300,30);
cbCpp.setBounds(300,200,150,30);
btnSubmit.setBounds(300,300,300,40);

c.add(lblName);
c.add(txtName);
c.add(lblSelect);
c.add(cbPython);
c.add(cbJava);
c.add(cbJavascript);
c.add(cbCpp);
c.add(btnSubmit);

ActionListener a1 = (ae) -> {
    try    {
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           String url = "jdbc:mysql://localhost:3306/tu27june22";
           String un ="root";
           String pw ="varad123";
           Connection con = DriverManager.getConnection(url,un,pw);
           String name = txtName.getText();
           String tech = "";
           
           if(cbPython.isSelected())    tech += "Python ";
           if(cbJava.isSelected())    tech += "Java ";
           if(cbJavascript.isSelected())    tech += "Javascript ";
           if(cbCpp.isSelected())    tech += "C++ ";
           
           String sql = "insert into student values(?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,name);
           pst.setString(2,tech);
           pst.executeUpdate();
           JOptionPane.showMessageDialog(c,"thanks");
           con.close();
    } catch(SQLException e){
        JOptionPane.showMessageDialog(c, e);
    }
};
btnSubmit.addActionListener(a1);

setTitle("Tech U Know App by VT");
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