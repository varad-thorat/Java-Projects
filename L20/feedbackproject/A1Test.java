import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

class A1 extends JFrame{
Container c;
JLabel lblName, lblFeedback;
JTextField txtName;
TextArea txtFeedback;
JButton btnSubmit;

A1(){
c = getContentPane();
c.setLayout(null);

lblName = new JLabel("enter name ");
txtName = new JTextField(20);
lblFeedback = new JLabel("Feedback");
txtFeedback = new TextArea(5, 20);
btnSubmit = new JButton("Submit");

Font f = new Font("Courier", Font.BOLD, 40);
lblName.setFont(f);
txtName.setFont(f);
lblFeedback.setFont(f);
txtFeedback.setFont(f);
btnSubmit.setFont(f);

lblName.setBounds(20, 20, 300 , 40);
txtName.setBounds(320, 20, 300 , 40);
lblFeedback.setBounds(20, 80, 300 , 40);
txtFeedback.setBounds(320, 80, 300 , 300);
btnSubmit.setBounds(320, 400 ,300 ,40);

c.add(lblName);
c.add(txtName);
c.add(lblFeedback);
c.add(txtFeedback);
c.add(btnSubmit);

ActionListener a1 = (ae) -> {

Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sf = cfg.buildSessionFactory();
Transaction t = null;

    try (Session s = sf.openSession();)   {
           java.util.List<Feedback> data = new ArrayList<>();
           data = s.createQuery("from Feedback").list();
           int id = data.size() + 1;
           String name = txtName.getText();
           String message = txtFeedback.getText(); 
           Feedback fb = new Feedback(id , name, message);
           t = s.beginTransaction();
           s.save(fb);
           t.commit();
           JOptionPane.showMessageDialog(c,"thanks for the feedback");
    } catch(Exception e){
        t.rollback();
        JOptionPane.showMessageDialog(c, "issue "+e);
    }
};
btnSubmit.addActionListener(a1);

setTitle("Feedback App by VT");
setSize(900, 600);
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
