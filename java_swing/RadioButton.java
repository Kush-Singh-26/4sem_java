import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButton extends JFrame implements ActionListener{
    
    JTextField tf;
    JRadioButton plainbutton, boldbutton, italicbutton, bolditalicbutton;   
    ButtonGroup radiobuttongroup;

    public RadioButton(){
        setTitle("Radio Button");
        setLayout(null);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf = new JTextField("Text Field",20);
        tf.setBounds(50,30,200,30);
        tf.setFont(new Font("Serif",Font.PLAIN, 14));

        plainbutton = new JRadioButton("Plain");
        boldbutton = new JRadioButton("Bold");
        italicbutton = new JRadioButton("Italic");
        bolditalicbutton = new JRadioButton("Bold + Italic");

        plainbutton.setBounds(50, 70, 100, 30);
        boldbutton.setBounds(150, 70, 100, 30);
        italicbutton.setBounds(50, 110, 100, 30);
        bolditalicbutton.setBounds(150, 110, 120, 30);

        plainbutton.setSelected(true);


        radiobuttongroup = new ButtonGroup();
        radiobuttongroup.add(plainbutton);
        radiobuttongroup.add(boldbutton);
        radiobuttongroup.add(italicbutton);
        radiobuttongroup.add(bolditalicbutton);
        
        
        plainbutton.addActionListener(this);
        boldbutton.addActionListener(this);
        italicbutton.addActionListener(this);
        bolditalicbutton.addActionListener(this);

        add(tf);
        add(plainbutton);
        add(boldbutton);
        add(italicbutton);
        add(bolditalicbutton);

        setVisible(true);


    } 

    public void actionPerformed(ActionEvent e){
        int style = Font.PLAIN;

        if (boldbutton.isSelected())
            style = Font.BOLD;
        else if (italicbutton.isSelected())
            style = Font.ITALIC;
        else if (bolditalicbutton.isSelected())
            style = Font.BOLD + Font.ITALIC;
        
        tf.setFont(new Font("Serif", style, 14));

        
    } 

    public static void main(String[] args) {
        new RadioButton();
    }
}
