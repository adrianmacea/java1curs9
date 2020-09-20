import javax.swing.*;

//constrangem tipul generic sa fie de un anumit tip folosind mostenirea - extends intre parantezele angulare
//in cazul de mai jos P poate sa fie orice fel de componenta, fie JPanel, fie ceva care se afla sub JPanel in arborele de mostenire
public class Fereastra<P extends JPanel> extends JFrame{// P de la panou
    
    P p;
    
    public Fereastra(P p){
        super("TITLU"); // super musai pe prima linie in constructor
        this.p = p;
        
        setVisible(true);
        setSize(500,500);
        setLocation(450,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(p);
    
    }
}