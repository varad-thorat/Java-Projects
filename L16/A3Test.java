import javax.swing.*;     //JFrame, JLabel
import java.awt.*;        //Container, Font, Color
import java.awt.event.*;

class A3 extends JFrame{
Container c;
JLabel lab;
JTextField txt;
JButton btn;

A3(){
c = getContentPane();
c.setLayout(new FlowLayout());

lab = new JLabel("enter number");
txt = new JTextField(10);
btn = new JButton("Find");

Font f = new Font("Courier", Font.BOLD, 50);
lab.setFont(f);
txt.setFont(f);
btn.setFont(f);

c.add(lab);
c.add(txt);
c.add(btn);

ActionListener a1 = (ae) -> {
        try{
            String s = txt.getText();
            int num = Integer.parseInt(s);
            String res = num % 2 == 0 ? "even" : "odd";
            JOptionPane.showMessageDialog(c, res);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(c, "u shud enter integers only");
            txt.setText("");
            txt.requestFocus();
        }
};
btn.addActionListener(a1);
setTitle("Mera tisra Frame ");
setSize(500, 200);
setLocationRelativeTo(null);                        //align window to center
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //terminates the operation in command line with clicking close
setVisible(true);                                   //make window visible
}
}

class A3Test{
public static void main(String args[]){
A3 a = new A3();
}
}
