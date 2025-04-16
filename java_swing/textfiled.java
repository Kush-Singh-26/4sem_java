import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class textfiled {
    public static void main(String[] args) {
        JFrame f = new JFrame("textfield");
        JButton b = new JButton("Sum");
        JTextField tf1 = new JTextField();
        tf1.setBounds(20,20, 100,20);
        JTextField tf2 = new JTextField();
        tf2.setBounds(120, 20, 100, 20);

        JLabel lb = new JLabel();
        lb.setBounds(50,50,100,20);
        lb.setToolTipText("Sum label");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                lb.setText("Sum = " + (a+b));
            }
        });

        f.add(b);
        f.add(tf1);
        f.add(tf2);
        f.add(lb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
