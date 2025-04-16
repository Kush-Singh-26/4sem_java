import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    // Components
    JTextField num1Field, num2Field, resultField;
    JButton addButton, subButton;
    JLabel num1Label, num2Label, resultLabel;

    public SimpleCalculator() {
        super("Simple Adder/Subtractor");

        Container contentPane = getContentPane();
        contentPane.setBackground(new Color(200, 220, 255));
        contentPane.setLayout(new FlowLayout()); 

        num1Label = new JLabel("Number 1:");
        num1Field = new JTextField(10); 

        num2Label = new JLabel("Number 2:");
        num2Field = new JTextField(10);

        addButton = new JButton("ADD (+)");
        subButton = new JButton("SUB (-)");

        resultLabel = new JLabel("Result:");
        resultField = new JTextField(12);
        resultField.setEditable(false); 
        resultField.setFont(new Font("Arial", Font.BOLD, 14)); 
        resultField.setBackground(Color.WHITE); 

        // --- Add Listeners ---
        addButton.addActionListener(this);
        subButton.addActionListener(this);

        // --- Add Components to Frame ---
        contentPane.add(num1Label);
        contentPane.add(num1Field);
        contentPane.add(num2Label);
        contentPane.add(num2Field);
        contentPane.add(addButton);
        contentPane.add(subButton);
        contentPane.add(resultLabel);
        contentPane.add(resultField);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400); 
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText().trim());
            double num2 = Double.parseDouble(num2Field.getText().trim());

            double result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
                 resultField.setText(String.valueOf(result)); 
            } else if (e.getSource() == subButton) {
                result = num1 - num2;
                 resultField.setText(String.valueOf(result)); 
            }

        } catch (NumberFormatException nfe) {
            resultField.setText("Error: Invalid Input");
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers in both fields.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
             resultField.setText("Error");
             JOptionPane.showMessageDialog(this,
                     "An unexpected error occurred: " + ex.getMessage(),
                     "Error",
                     JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
