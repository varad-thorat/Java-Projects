package pa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A1Test extends JFrame{
Container c;
JButton btnDate, btnTime;

A1(){
c.getContentPane();
c.setLayout(new FlowLayout());

btnDate = new JButton("Date");
btnTime = new JButton("Time");

Font f = new Font("Courier", Font.BOLD, 30);
btnDate.setFont(f);
btnTime.setFont(f);

c.add(btnDate);
c.add(btnTime);

ActionListener a1 = (ae) -> {
        LocalDate d = LocalDate.now();
        DateTimeFormatter fo = DateTimeFormatter.ofPattern("dd / MMMM / YY");
        String ds = d.format(fo);
        JOptionPane.showMessageDialog(c, d);
        
    }
btnDate.addActionListener(a1);
ActionListener a2 = (ae) -> {
        LocalTime t = LocalTime.now();
        DateTimeFormatter fo = DateTimeFormatter.ofPattern("dd / MMMM / YY");
        String ds = t.format(fo);
        JOptionPane.showMessageDialog(c, t);
        
    }
btnTime.addActionListener(a2);
setTitle("Date Time App ");
setSize(300,300);
setLocationRelativeTo(null);
setVisible(true);
}
}

class A1Test{
public static void main(String args[]){
A1 a = new A1();
}
}
