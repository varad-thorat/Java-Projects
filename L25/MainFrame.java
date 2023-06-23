import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MainFrame extends JFrame{
Container c;
JButton btnAdd, btnView;

MainFrame(){
c = getContentPane();
c.setLayout(new FlowLayout());

btnAdd = new JButton("Add");
btnView = new JButton("View");

c.add(btnAdd);
c.add(btnView);

ActionListener a1 = (ae) -> {
        AddFrame a = new AddFrame();
        dispose();
};
btnAdd.addActionListener(a1);

ActionListener a2 = (ae) -> {
        ViewFrame a = new ViewFrame();
        dispose();
};
btnView.addActionListener(a2);
setTitle("Student Management System");
setSize(400,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}