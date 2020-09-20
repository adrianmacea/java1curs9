import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E12SuffleDeck extends JFrame{
    
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("Options");
    JMenuItem mi1 = new JMenuItem("Suffle");
    JMenuItem mi2 = new JMenuItem("Exit");
    
    DefaultListModel<GameCard> model = new DefaultListModel<GameCard>(); //avem nevoie de acest adaptor, acest model implicit pentru a crea un JList
    JList<GameCard> list = new JList<GameCard>(model); //am bazat lista de carti pe "model" parsand ca parametru modelul la crearea listei constructorului
    
    Deck d = new Deck();
    
    JScrollPane jsp = new JScrollPane(list);
    
    public E12SuffleDeck(){
        super("SUFFLE GAME");
        setVisible(true);
        setSize(600,600);
        setLocation(450,250);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setJMenuBar(mb);
        mb.add(m1);
        m1.add(mi1); m1.add(mi2);
        
        add(jsp); //nu mai adaugam add(list) pentru ca jsp contine deja lista
        
        ArrayList<GameCard> carti = d.getCards();
        for(GameCard c: carti){
            model.addElement(c);
        }
        
        mi1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    d.amesteca();
                    //dupa amestecare reafisez cartile
                    ArrayList<GameCard> carti = d.getCards();
                    //dar trebuie sa sterg ceea ce am deja, pt ca se vor adauga alt set de instante
                    model.clear();
                    //abia acumpot sa parcurg noul deck amestecat
                    for(GameCard c: carti){
                        model.addElement(c);
                    }
                }
            }
        );
        
        mi2.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    System.exit(0);
                }
            }
        );
        
    }
    
    public static void main(String [] args){
        new E12SuffleDeck();
    }
    
}