import java.util.*;

public class E03ArrayList{
    public static void main(String [] args){
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> l2 = new ArrayList<ArrayList<Integer>>(); //putem crea lista de liste
        
        l1.add(4); //aici 4 este un Integer, pt ca asta este tipul pe care l-am asignat lui l1
        // l1.remove(4); //aici 4 este un index, pt ca nu i-am spus explicit ca e un integer, dar indexul 4 nu exista, 
        // deoarece avem momentan un singur obiect adaugat la lista, deci trebuie sa stergem scriind:
        l1.remove(0); //asta va sterge elementul din indexul zero, sau alternativ puteam scrie si:
        //l1.remove(new Integer(4)); - asta ar fi sters toate elementele 4 din lista
        //deci putem sterge din lista dupa index sau dupa obiect
        
        l2.add(l1);
        l2.add(new ArrayList<Integer>());
        
    }
}