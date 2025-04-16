import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxItemListenerExample extends JFrame implements ItemListener {

    // Declare components
    JComboBox<String> comboBox;
    JLabel label;

    Color defaultColor = Color.RED;


    // Constructor
    ComboBoxItemListenerExample() {
        // Frame setup
        setTitle("ComboBox with ItemListener");
        setSize(300, 200);
        setLayout(new FlowLayout());
        getContentPane().setBackground(defaultColor);

        // ComboBox items
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        // Initialize components
        comboBox = new JComboBox<>(colors);
        label = new JLabel("Select a color");

        // Add item listener to comboBox
        comboBox.addItemListener(this);


        // Add components to frame
        add(comboBox);
        add(label);

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Handle item selection
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboBox) {
            String selected = (String) comboBox.getSelectedItem();
            label.setText("Selected: " + selected);

            // Change background color based on selection
            switch (selected) {
                case "Red":
                    getContentPane().setBackground(Color.RED);
                    break;
                case "Green":
                    getContentPane().setBackground(Color.GREEN);
                    break;
                case "Blue":
                    getContentPane().setBackground(Color.BLUE);
                    break;
                case "Yellow":
                    getContentPane().setBackground(Color.YELLOW);
                    break;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        new ComboBoxItemListenerExample();
    }
}
