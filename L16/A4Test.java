import javax.swing.*;       //JFrame, JLabel, JButton, JTextField
import java.awt.*;          //Container, Font, Color, FlowLayout
import java.awt.event.*;    //ActionListerner

class A4 extends JFrame{
Container c;
JLabel lab;
JTextField txt;
JButton btn;

A4(){
c = getContentPane();
FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 20, 20);
c.setLayout(fl);

lab = new JLabel("enter number");
txt = new JTextField(8);
btn = new JButton("Find Square root");

Font f = new Font("Arial", Font.BOLD, 50);
lab.setFont(f);
txt.setFont(f);
btn.setFont(f);

c.add(lab);
c.add(txt);
c.add(btn);

ActionListener a1 = (ae) -> {
        try{
            String s = txt.getText();
            double num = Double.parseDouble(s);
            if(num >=0){
            double res = Math.sqrt(num); 
            String msg = "Square root = " + res; 
            JOptionPane.showMessageDialog(c, msg);
            }else{
                String res2 = "enter a number >=0";
                JOptionPane.showMessageDialog(c,res2);
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(c, "u shud enter integers only");
            txt.setText("");
            txt.requestFocus();
        }
};
btn.addActionListener(a1);

setTitle("Mera chautha Frame ");
setSize(700, 300);
setLocationRelativeTo(null);                        //align window to center
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //terminates the operation in command line with clicking close
setVisible(true);                                   //make window visible
}
}

class A4Test{
public static void main(String args[]){
A4 a = new A4();
}
}
