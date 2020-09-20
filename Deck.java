import java.util.*;

public class Deck{
    
    private ArrayList<GameCard> deck = new ArrayList<GameCard>();
    
    public Deck(){
        for(CardType t: CardType.values()){
            for(CardValue v: CardValue.values()){
                deck.add(new GameCard(t,v));
            }
        }
    }
    
    public void amesteca(){
        Collections.shuffle(deck); //folosesc metoda suffle a clasei java.util.Collections
    }
    
    public ArrayList<GameCard> getCards(){
        return deck;
    }
}