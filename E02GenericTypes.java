public class E02GenericTypes{
    public static void main (String [] args){
        Graf<Integer, Double> g1 = new Graf<Integer, Double>();
        Graf<Double, Integer> g2 = new Graf<Double, Integer>(); // g1 nu este echivalent cu g2 - ordinea conteaza
        
        Graf<Numar<Integer>,Numar<Graf<Integer,Double>>> g3 = new Graf<Numar<Integer>,Numar<Graf<Integer,Double>>>(); //nested generic types
    }
}