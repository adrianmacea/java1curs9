import java.util.*;

public class E10SortareObiecte{
    public static void main(String [] args){
        ArrayList<Pisica> lista = new ArrayList<Pisica>();
            lista.add(new Pisica("Tom"));
            lista.add(new Pisica("Leo"));
            lista.add(new Pisica("Pisi"));
        
        //pentru a sorta o lista este nevoie ca elementele sa fie comparabile
        //de ex. in cazul unei liste de pisici trebuie sa definim noi criteriul
        Collections.sort(lista, Collections.reverseOrder());
        
        for(Pisica p: lista){
            System.out.println(p);
        }
    }
}