import java.awt.event.ActionEvent; import java.awt.event.ActionListener; import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
class get_me {
public JFrame createFrame() {

JFrame f = new JFrame("Student Form"); JButton b = new JButton("Submit"); b.setBounds(50, 340, 100, 30); JLabel l1, l2, l3, l4, l5, l6;

l3 = new JLabel("Student Form");

l3.setBounds(50, 15, 100, 30);

l1 = new JLabel("Gender");

l1.setBounds(50, 40, 100, 30);

l2 = new JLabel("Year");

l2.setBounds(50, 120, 150, 30);
JCheckBox c1 = new JCheckBox("FE");

c1.setBounds(50, 140, 50, 30);


JCheckBox c2 = new JCheckBox("SE");

c2.setBounds(50, 170, 50, 30);

JCheckBox c3 = new JCheckBox("TE");

c3.setBounds(50, 200, 50, 30);

JCheckBox c4 = new JCheckBox("BE");	

c4.setBounds(50, 230, 50, 30);

JRadioButton r1 = new JRadioButton("A) Male");

JRadioButton r2 = new JRadioButton("B) Female");

r1.setBounds(50, 60, 100, 30);

r2.setBounds(50, 90, 100, 30);

l4 = new JLabel("Programming Languages");

l4.setBounds(50, 250, 150, 30);

String country[] = { "C++", "Python", "Java", "Javascript", "PHP" };

JComboBox cb = new JComboBox(country);

cb.setBounds(50, 280, 100, 30);

l5 = new JLabel("Students Info");
l5.setBounds(400, 15, 150, 30);

String data[][] = { { "ID", "NAME", "CGPA" }, { " ", " ", " " }, { "101", "Amit", "7.8" },


{ "102", "Jai", "7.3" },

{ "103", "Sachin", "8.6" } };

String column[] = { "ID", "NAME", "CGPA" };
final JTable t = new JTable(data, column);
t.setBounds(400, 45, 230, 80);
JScrollPane sp = new JScrollPane(t); 
DefaultListModel<String> li1 = new DefaultListModel<>(); 
li1.addElement("Siddhart Mishra (L&T)"); 
li1.addElement("Saloni Pathak (Reliance)"); 
li1.addElement("Rahul Sharma (TCS)"); 
li1.addElement("Ram Rauther (Accenture)"); 
JList<String> list = new JList<>(li1); 
list.setBounds(400, 170, 160, 75); 
l6 = new JLabel("Alumini");

l6.setBounds(400, 140, 150, 30);

f.add(list);
f.add(sp);

f.add(t);


f.add(cb);

f.add(r1);

f.add(r2);

f.add(c1);

f.add(c2);

f.add(c3);

f.add(c4);

f.add(l1);

f.add(l2);

f.add(l4);

f.add(l3);

f.add(l5);

f.add(l6);

f.add(b);

return f;

}
public JFrame create_home() {


    JFrame f = new JFrame("Home Page Here");
    
    DefaultMutableTreeNode	style	=	new
    DefaultMutableTreeNode("Student Info");		
    DefaultMutableTreeNode	color	=	new
    DefaultMutableTreeNode("IT");			
    DefaultMutableTreeNode	font	=	new
    DefaultMutableTreeNode("Exam");			
    style.add(color);			
    style.add(font);			
    DefaultMutableTreeNode	red	=	new
    DefaultMutableTreeNode("FE");			
    DefaultMutableTreeNode	blue	=	new
    DefaultMutableTreeNode("SE");			
    DefaultMutableTreeNode	black	=	new
    DefaultMutableTreeNode("TE");			
    DefaultMutableTreeNode	green	=	new
    
    DefaultMutableTreeNode("FY");
    
    color.add(red);
    
    color.add(blue);
    color.add(black);

    color.add(green);
    
    
    JTree jt = new JTree(style);
    
    f.add(jt);
    
    return f;
    
    }
    
    }
    
    
    
    
    public class Swing_prac1 {
    
    static JMenuBar mb;
    
    static JMenu x;
    
    static JMenuItem m1, m2;
    
    private static JFrame f;
    
    
    
    
    public static void main(String args[]) { get_me gm = new get_me();
    
    mb = new JMenuBar();
    
    x = new JMenu("Menu");
    m1 = new JMenuItem("Home");

    m2 = new JMenuItem("Login");
    
    
    x.add(m1);
    
    x.add(m2);
    
    mb.add(x);
    
    m1.addActionListener(new ActionListener() { @Override
    
    public void actionPerformed(ActionEvent e) { System.out.println("here"); f.removeAll();
    
    f.setVisible(false);
    
    f = gm.create_home();
    
    f.setJMenuBar(mb);
    
    f.setSize(700, 500);
    
    f.setVisible(true);
    
    }
    
    });
    
    m2.addActionListener(new ActionListener() {
     
    
        @Override


        public void actionPerformed(ActionEvent e) { System.out.println("Login"); f.removeAll();
        
        f.setVisible(false);
        
        f = gm.createFrame();
        
        f.setJMenuBar(mb);
        
        f.setSize(700, 500);
        
        f.setLayout(null);
        
        f.setVisible(true);
        
        
        
        
        }
        
        });
        
        f = gm.createFrame();
        
        f.setJMenuBar(mb);
        
        f.setSize(700, 500);
        
        f.setLayout(null);
        f.setVisible(true);

    }
    
    
    }
                        
