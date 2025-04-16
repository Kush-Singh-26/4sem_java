import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class combobox extends JFrame implements ItemListener{
    JLabel l , ll;
    JComboBox<String> cb;
    String s[] = {" Bhubaneswar", "New Delhi" , "Kolkata", "Mumbai", "Bangalore"};

    public combobox(){
        setTitle("Combo Box");
        setSize(400,400);
        setLayout(new FlowLayout());

        l = new JLabel("Select your City ");
        l.setForeground(Color.red);

        ll = new JLabel("Bhubaneswar selected");

        cb = new JComboBox<>(s);
        cb.addItemListener(this);

        JPanel p = new JPanel();
        p.add(l);
        p.add(cb);
        p.add(ll);

        add(p);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cb && e.getStateChange() == ItemEvent.SELECTED) {
            ll.setText(cb.getSelectedItem() + " selected");
        }
    }

    public static void main(String[] args) {
        new combobox();
    }

}
