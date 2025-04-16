import javax.swing.*;
import java.awt.event.*;

public class textarea {
    public static void main(String[] args) {
        JFrame f = new JFrame("Text Area");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea ta = new JTextArea();
        ta.setBounds(20, 20, 200, 100);

        JButton b = new JButton("Submit");
        b.setBounds(20, 130, 100, 30);

        JLabel lb = new JLabel("nothing entered");
        lb.setBounds(20, 170, 300, 20);

        f.add(ta);
        f.add(b);
        f.add(lb);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lb.setText(ta.getText());
            }
        });

        f.setVisible(true);
    }
}
