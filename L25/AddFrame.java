import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class AddFrame extends JFrame{
Container c;
JLabel labRno, labName;
JTextField txtRno, txtName;
JButton btnSave,btnBack;

AddFrame(){
c = getContentPane();
c.setLayout(new FlowLayout());

labRno = new JLabel("rno");
txtRno = new JTextField(30);
labName = new JLabel("name");
txtName = new JTextField(30);
btnSave = new JButton("save");
btnBack = new JButton("back");

c.add(labRno);
c.add(txtRno);
c.add(labName);
c.add(txtName);
c.add(btnSave);
c.add(btnBack);

ActionListener a1 = (ae) -> {
        MainFrame a = new MainFrame();
        dispose();
};
btnBack.addActionListener(a1);

ActionListener a2 = (ae) -> {
        int rno = Integer.parseInt(txtRno.getText());
        String name = txtName.getText();
        try{
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                String url = "jdbc:mysql://localhost:3306/kc9july22";
                String un = "root";
                String pw = "varad123";
                Connection con = DriverManager.getConnection(url, un, pw);
                String sql = "insert into student values(?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, rno);
                pst.setString(2, name);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(c, "record added");
                con.close();
        }
        catch(SQLException e){
                JOptionPane.showMessageDialog(c, "issue" + e);
        }
};
btnSave.addActionListener(a2);




setTitle("Add Student");
setSize(400,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}