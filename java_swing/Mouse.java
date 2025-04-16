import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Mouse extends JFrame implements MouseListener, MouseMotionListener {
    JLabel lb;

    public Mouse(){
            setTitle("Mouse Events");
            lb = new JLabel();
            getContentPane().add(lb, BorderLayout.SOUTH);
            addMouseListener(this);
            addMouseMotionListener(this);
            setSize(400,400);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e){
        lb.setText("Clicked at : [" + e.getX() + ", " + e.getY() + "] ");
    }

    public void mousePressed(MouseEvent e){
        lb.setText("Pressed at : [" + e.getX() + ", " + e.getY() + "] ");
    }

    public void mouseReleased(MouseEvent e){
        lb.setText("Released at : [" + e.getX() + ", " + e.getY() + "] ");
    }

    public void mouseEntered(MouseEvent e){
        lb.setText("Entered at : [" + e.getX() + ", " + e.getY() + "] ");
        getContentPane().setBackground(Color.GREEN);
    }

    public void mouseExited(MouseEvent e){
        lb.setText("Exited at : [" + e.getX() + ", " + e.getY() + "] ");
        getContentPane().setBackground(Color.WHITE);
    }

    public void mouseDragged(MouseEvent e){
        lb.setText("Dragged at : [" + e.getX() + ", " + e.getY() + "] ");
    }

    public void mouseMoved(MouseEvent e){
        lb.setText("Moved at : [" + e.getX() + ", " + e.getY() + "] ");
    }

    public static void main(String[] args) {
        new Mouse();
    }
}
