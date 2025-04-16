    import javax.swing.*;
    import java.awt.event.*;;

    public class label {
        public static void main(String[] args) {
            JFrame f = new JFrame("Jlable example");
            JButton b = new JButton("Click here");
            JLabel lb = new JLabel();
            lb.setBounds(50,50,100,20);
            lb.setText("Button not cliked yet");
            lb.setToolTipText("This is a label");
            b.setBounds(50,100,100,30);
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    lb.setText("Button clicked");
                }
            });
            f.add(b);
            f.add(lb);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
        }
    }
