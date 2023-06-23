import javax.swing.*;
import java.awt.*;

class A1 extends JFrame{
Container c;
JLabel lab;

A1(){
c = getContentPane();
lab = new JLabel("Good Afternoon", JLabel.CENTER);
Font f = new Font("Arial", Font.BOLD, 70);
lab.setFont(f);
lab.setForeground(Color.BLUE);
c.add(lab);

setTitle("Mera Pehla Frame");
setSize(700, 200);
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
