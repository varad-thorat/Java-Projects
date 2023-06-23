import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A1 extends JFrame
{
Container c;
JLabel LabAmount;
JTextField txtAmount;
JButton btnConvert;

A1()
{
c = getContentPane();
c.setLayout(new FlowLayout());

LabAmount = new JLabel("enter amount in $$");
txtAmount = new JTextField(15);
btnConvert = new JButton("convert");

ActionListener a1 =(ae) ->{
try
{
String a = txtAmount.getText();
double aid = Double.parseDouble(a);
if(aid <= 0.0)
	throw new Exception("invalid amount");
double air = aid * 79.50;
String msg = "air ="+ String.format("\u20B9%.2f" , air);
JOptionPane.showMessageDialog(c,msg); 

}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(c," number only");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(c,e.getMessage());
txtAmount.setText("");
txtAmount.requestFocus();
}
};
btnConvert.addActionListener(a1);

Font f = new Font("calibri" , Font.BOLD,40);
LabAmount.setFont(f);
txtAmount.setFont(f);
btnConvert.setFont(f);

c.add(LabAmount);
c.add(txtAmount);
c.add(btnConvert);

setTitle("cc by om");
setSize(600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}
}

class A1Test
{
public static void main(String args[])
{
A1 a = new A1();

}

}