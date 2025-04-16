import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Form extends JFrame implements ActionListener {
    JLabel namelb, RollNolb, CGPAlb, Branchlb, Emaillb, resultlb;
    JTextField nametf, rolltf, cgpatf, emailtf;
    JButton submitb, resetb, changeb;
    JComboBox<String> branchbox;

    public Form() {
        setTitle("Form");
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GREEN);

        namelb = new JLabel("Name : ");
        nametf = new JTextField(15);

        RollNolb = new JLabel("Roll No : ");
        rolltf = new JTextField(15);

        CGPAlb = new JLabel("CGPA:");
        cgpatf = new JTextField(15);

        Branchlb = new JLabel("Branch:");
        String[] branches = { "CSE", "IT", "CSCE", "CSSE" };
        branchbox = new JComboBox<>(branches);

        Emaillb = new JLabel("Email ID:");
        emailtf = new JTextField(15);

        submitb = new JButton("Submit");
        resetb = new JButton("Reset");
        changeb = new JButton("Change Colour");

        resultlb = new JLabel();

        submitb.addActionListener(this);
        resetb.addActionListener(this);
        changeb.addActionListener(this);

        add(namelb);
        add(nametf);
        add(RollNolb);
        add(rolltf);
        add(CGPAlb);
        add(cgpatf);
        add(Branchlb);
        add(branchbox);
        add(Emaillb);
        add(emailtf);
        add(submitb);
        add(resetb);
        add(changeb);
        add(resultlb);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitb) {
            try {
                String name = nametf.getText();
                String roll = rolltf.getText();
                String cgpa = cgpatf.getText();
                String branch = (String) branchbox.getSelectedItem();
                String email = emailtf.getText();

                if (roll.length() > 8 || roll.length() < 7 || !roll.matches("\\d+")) {
                    throw new Exception("Roll no must be greater than 7 and less than 8 in length and numeric");
                }

                Double cgpad = Double.parseDouble(cgpa);
                if (cgpad > 10.0 || cgpad < 6.0) {
                    throw new Exception("CGPA must be greater than 6.0 and less tha 10.0");
                }

                if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                    throw new Exception("Invalid email format");
                }

                resultlb.setText("Name : " + name + " Rollno : " + roll + "  cgpa : " + cgpa + " Branch : " + branch
                        + " Email : " + email);
            } catch (Exception ex) {
                resultlb.setText(ex.getMessage());
            }
        }

        else if (e.getSource() == resetb) {
            nametf.setText("");
            rolltf.setText("");
            cgpatf.setText("");
            branchbox.setSelectedIndex(0);
            emailtf.setText("");
            resultlb.setText("");
        } else if (e.getSource() == changeb) {
            Color newColor = getContentPane().getBackground().equals(Color.GREEN) ? Color.PINK : Color.GREEN;
            getContentPane().setBackground(newColor);
        }
    }

    public static void main(String Args[]) {
        new Form();
    }
}