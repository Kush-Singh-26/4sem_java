import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChange extends JFrame implements ActionListener {

    // Declare components
    JLabel label, label2;
    JTextField textField;
    JButton button;

    // Constructor
    ColorChange() {
        // Frame title, size, layout
        setTitle("Swing Example");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Initialize components
        label = new JLabel("Enter Name:");
        textField = new JTextField(15); // set column size
        button = new JButton("Submit");
        button.addActionListener(this); // Register action listener
        label2 = new JLabel(); // For showing entered text

        // Add components in order
        add(label);
        add(textField);
        add(button);
        add(label2);

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        getContentPane().setBackground(Color.PINK); // Change background color
        label2.setText(textField.getText()); // Set text from text field
    }

    // Main method
    public static void main(String[] args) {
        new ColorChange();
    }
}
