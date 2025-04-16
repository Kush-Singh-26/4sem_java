import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

public class checkbox {
    public static void main(String[] args) {
        JFrame f = new JFrame("Check Box");
        f.setLayout(null);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField tf = new JTextField("Text field", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        tf.setBounds(50, 30, 200, 30);

        JCheckBox bold = new JCheckBox("Bold");
        bold.setBounds(50, 70, 70, 30);

        JCheckBox italic = new JCheckBox("Italic");
        italic.setBounds(130, 70, 70, 30);

        ActionListener styleListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int style = Font.PLAIN;
                if (bold.isSelected())
                    style += Font.BOLD;
                if (italic.isSelected())
                    style += Font.ITALIC;
                tf.setFont(new Font("Serif", style, 14));
            }
        };

        bold.addActionListener(styleListener);
        italic.addActionListener(styleListener);

        f.add(tf);
        f.add(bold);
        f.add(italic);
        f.setVisible(true);
    }

}
