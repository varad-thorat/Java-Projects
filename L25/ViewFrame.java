import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class ViewFrame extends JFrame{
Container c;
TextArea taData;
JButton btnBack;

ViewFrame(){
c = getContentPane();
c.setLayout(new FlowLayout());

taData = new TextArea(10, 50);
btnBack = new JButton("Back");

StringBuffer data = new StringBuffer();
         try{
					DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
					String url = "jdbc:mysql://localhost:3306/kc9july22";
					String un = "root";
					String pw = "varad123";
					Connection con = DriverManager.getConnection(url,un,pw);
					
					String sq = "select * from student";
					Statement stmt = con.prepareStatement(sq);
					ResultSet rs = stmt.executeQuery(sq);
					while(rs.next()){
						int rno = rs.getInt(1);
						String name = rs.getString(2);
						data.append("rno : " + rno + " | name : " + name + "\n");
					
	                                     }
	                                     taData.setText(data.toString());
	                                     con.close();
	}catch(SQLException e){
	        JOptionPane.showMessageDialog(c, "Issue " + e);
	}

c.add(taData);
c.add(btnBack);

ActionListener a1 = (ae) -> {
                MainFrame a = new MainFrame();
                dispose();
};
btnBack.addActionListener(a1);

setTitle("View Student");
setSize(400,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}
