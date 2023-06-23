
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class A1 extends JFrame{
Container c;
JLabel lblName, lblSelect;
JTextField txtName;
JRadioButton rbJob, rbMs, rbMba;
JButton btnSubmit;

A1(){
c = getContentPane();
c.setLayout(null);

lblName = new JLabel("enter name ");
txtName = new JTextField(10);
lblSelect = new JLabel("select any one option ");
rbJob = new JRadioButton("Job");
rbMs = new JRadioButton("MS");
rbMba = new JRadioButton("MBA");
btnSubmit = new JButton("Submit");

Font f = new Font("Courier", Font.BOLD, 30);
lblName.setFont(f);
txtName.setFont(f);
lblSelect.setFont(f);
rbJob.setFont(f);
rbMs.setFont(f);
rbMba.setFont(f);
btnSubmit.setFont(f);

lblName.setBounds(20, 40, 300 , 30);
txtName.setBounds(300, 40, 300 , 30);
lblSelect.setBounds(20, 100, 600 , 30);
rbJob.setBounds(300, 140, 300, 30);
rbMs.setBounds(300, 200, 300, 30);
rbMba.setBounds(300, 260, 300, 30);
btnSubmit.setBounds(300,300 ,300 ,40);

ButtonGroup bg = new ButtonGroup();

bg.add(rbJob);
bg.add(rbMs);
bg.add(rbMba);

c.add(lblName);
c.add(txtName);
c.add(lblSelect);
c.add(rbJob);
c.add(rbMs);
c.add(rbMba);
c.add(btnSubmit);

ActionListener a1 = (ae) -> {
    try    {
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           String url = "jdbc:mysql://localhost:3306/wn27june22";
           String un ="root";
           String pw ="varad123";
           Connection con = DriverManager.getConnection(url,un,pw);
           String name = txtName.getText();
           String choice = "";
           if(rbJob.isSelected())
               choice = "JOB";
           else if(rbMs.isSelected())
               choice = "MS";
           else
               choice = "MBA";
               
           String sql = "insert into student values(?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,name);
           pst.setString(2,choice);
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
