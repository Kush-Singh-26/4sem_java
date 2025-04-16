import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class Listswing extends JFrame{
    JList colourlist;
    String colournames[] = {"Black", "Blue", "Cyan", "Gray", "Green", "Magenta", "Orange", "Pink", "Red", "Yellow"};
    Color colours[] = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GRAY, Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW};

    public Listswing(){
        setTitle("List");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colourlist = new JList<>(colournames);

        colourlist.setVisibleRowCount(5);
        colourlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        
        JScrollPane scrollPane = new JScrollPane(colourlist);
        add(scrollPane);

        colourlist.addListSelectionListener (new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event){
                getContentPane().setBackground(colours[colourlist.getSelectedIndex()]);
            }
        });

        setVisible(true);

    }
    
    
    public static void main(String[] args) {
        new Listswing();
    }
}
