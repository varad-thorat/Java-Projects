import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A5 extends JFrame{
Container c;
JLabel lab1,lab2;
JTextField txt1,txt2;
JButton btn;

A5(){
c = getContentPane();
c.setLayout(null);        //this gives full control of layout design to user

lab1 = new JLabel("Enter First Number: ");
txt1 = new JTextField(10);
lab2 = new JLabel("Enter Second Number: ");
txt2 = new JTextField(10);
btn = new JButton("Sum");

Font f = new Font("Courier", Font.BOLD, 24);
lab1.setFont(f);
txt1.setFont(f);
lab2.setFont(f);
txt2.setFont(f);
btn.setFont(f);

lab1.setBounds(10, 30, 300, 30);        // (x,y,width,height)
txt1.setBounds(300, 30, 300, 30);
lab2.setBounds(10, 90, 500, 30);
txt2.setBounds(300, 90, 300, 30);
btn.setBounds(300, 150, 300, 30);

c.add(lab1);
c.add(txt1);
c.add(lab2);
c.add(txt2);
c.add(btn);

ActionListener a1 = (ae) -> {
        String fn = "", sn = "";
        double n1=0.0, n2=0.0, res=0.0;
        
        try{
            fn = txt1.getText();
            n1 = Double.parseDouble(fn);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(c, "first number is invalid");
            txt1.setText("");
            txt1.requestFocus();
            return;
        }
        
        try{
            sn = txt2.getText();
            n2 = Double.parseDouble(fn);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(c, "second number is invalid");
            txt2.setText("");
            txt2.requestFocus();
            return;
        }
        res = n1 + n2;
        String msg = "addn = "+ res;
            JOptionPane.showMessageDialog(c, msg);
};
btn.addActionListener(a1);

setTitle("Add 2 numbers App by VT");
setSize(700, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class A5Test{
public static void main(String args[]){
A5 a = new A5();
}
}