public class GameCard{
    CardType t;
    CardValue v;
    
    public GameCard(CardType t, CardValue v){
        this.t = t;
        this.v = v;
    }
    
    public String toString(){
        return v+" de "+t;
    }
}