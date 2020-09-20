import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E13ListaPersoane extends JFrame{
    
    DefaultListModel<Persoana> model = new DefaultListModel<Persoana>(); //avem nevoie de acest adaptor, acest model implicit pentru a crea un JList
    JList<Persoana> list = new JList<Persoana>(model); //am bazat lista de persoane pe "model" parsand ca parametru modelul la crearea listei constructorului
    JScrollPane jsp = new JScrollPane(list); //am adaugat lista intr-un scroll bar
    
    JPanel p1 = new JPanel(new BorderLayout());
    JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    JLabel nume = new JLabel("Nume: ");
    JTextField t1 = new JTextField(20);
    JLabel prenume = new JLabel("Prenume: ");
    JTextField t2 = new JTextField(20);
    JButton b = new JButton("Adauga");
    
    ArrayList<Persoana> persoane = new ArrayList<Persoana>();    
    
    public E13ListaPersoane(){
        super("Lista Persoane");
        setVisible(true);
        setSize(800,800);
        setLocation(450,250);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(p1);
        add(p2, BorderLayout.SOUTH);
        
        p1.add(jsp);
        p2.add(nume); p2.add(t1);
        p2.add(prenume); p2.add(t2);
        p2.add(b);
        
        b.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    String nume = t1.getText();
                    String prenume = t2.getText();
                    Persoana pers = new Persoana(nume,prenume);
                    persoane.add(pers);
                    model.addElement(pers);
                    t1.setText("");
                    t2.setText("");
                }
            }
        );
        
        list.addMouseListener(
            new MouseAdapter(){
                public void mouseClicked(MouseEvent ev){
                    if(ev.getClickCount() == 2){
                        Persoana pers = (Persoana) list.getSelectedValue(); //luam elementul pe care s-a dat click
                        persoane.remove(pers); //stergem elementul din lista
                        model.clear(); //stergem din model elementele
                        for(Persoana i: persoane){//parcurgem si readaugam persoanele in model
                            model.addElement(i);
                        }
                    }
                }
            }
        );
        
    }
    
    public static void main(String [] args){
        new E13ListaPersoane();
    }
    
}
