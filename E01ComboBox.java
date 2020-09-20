import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E01ComboBox extends JFrame{
    
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    JLabel l1 = new JLabel("Shape: ");
    JComboBox<String> cb = new JComboBox<String>();
    
    public E01ComboBox(){
        super("Combo Box");
        setVisible(true);
        setSize(800,800);
        setResizable(false);
        setLocation(450,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(p1);
        add(p2, BorderLayout.NORTH);
        p2.add(l1);
        p2.add(cb);
            cb.addItem("Circle");
            cb.addItem("Square");
        
        p1.addMouseMotionListener(
            new MouseAdapter(){
                public void mouseDragged(MouseEvent ev){
                    int x = ev.getX()-25;
                    int y = ev.getY()-25;
                    Graphics g = p1.getGraphics();
                    
                    if(cb.getSelectedItem().equals("Circle")){
                        g.fillOval(x,y,50,50);
                    }else{
                        g.fillRect(x,y,50,50);
                    }
                    
                }
            }
        );
        
    }
    
    public static void main (String [] args){
        new E01ComboBox();
    }
}