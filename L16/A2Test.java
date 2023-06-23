import javax.swing.*;     //JFrame, JLabel
import java.awt.*;        //Container, Font, Color
import java.time.*;

class A2 extends JFrame{
Container c;
JLabel lab;
A2(){
c = getContentPane();
String msg = "";

LocalTime t = LocalTime.now();
int hr = t.getHour();
if(hr<12)        msg = "Good Morning";
else if(hr<16)   msg = "Good Afternoon";
else             msg = "Good Evening"; 

lab = new JLabel(msg, JLabel.CENTER);
Font f = new Font("Courier", Font.BOLD, 50);
lab.setFont(f);
c.add(lab);

setTitle("Mera Dusra Frame ");
setSize(500, 200);
setLocationRelativeTo(null);                        //align window to center
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //terminates the operation in command line with clicking close
setVisible(true);                                   //make window visible
}
}

class A2Test{
public static void main(String args[]){
A2 a = new A2();
}
}