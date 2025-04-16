import javax.swing.*;
import java.awt.event.*;

public class passwordfield {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password field");
        JPasswordField pf1 = new JPasswordField();
        pf1.setBounds(20,20, 100, 20);
        JPasswordField pf2 = new JPasswordField();
        pf2.setEchoChar('@');
        pf2.setBounds(120,20,100,20);
        JLabel lb = new JLabel();
        lb.setBounds(50,50,150,20);
        lb.setToolTipText("sum label");
        JButton b = new JButton("Sum");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int a = Integer.parseInt(new String(pf1.getPassword()));
                    int b = Integer.parseInt(new String(pf2.getPassword()));
                    lb.setText("Sum = " + (a+b));
                }catch(NumberFormatException ex){
                    lb.setText("Invalid Input");
                }
                
            }
        } );
        f.setLayout(null);
        b.setBounds(50,100,95,30);
        f.add(b);
        f.add(lb);
        f.add(pf1);
        f.add(pf2);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }    
}
