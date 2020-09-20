/**
 * Facem un graf (fara o orientare) cu legaturi intre nodurile de mai jos. Fiecare legatura reprezinta o muchie.
 * Lista de Adiacenta = totalitatea nodurilor conectate printr-o muchie la un alt nod, adica o lista pt fiecare nod in parte,
 * deci Lista de Adiacenta este o Lista de Liste.
 * (Se poate face si cu Map daca vrem sa denumim nodurile intr-un anumit fel, dar putem sa facem si cu ArrayList care este indexat)
 * 
 * 1-2
 * 2-3
 * 1-3
 * 4-5
 * 3-5
 */

import java.util.*;

public class E11ListaDeAdiacenta{
    public static void main (String [] args){
        ArrayList<ArrayList<Integer>> la = new ArrayList<ArrayList<Integer>>(); //am creat lista de liste dar ea este goala deocamdata
            //adaugam o lista pentru fiecare nod, in cazul nostru 5
            //daca nu facem adaugare vom avea IndexOutOfBoundException
            la.add(new ArrayList()); //la index 0
            la.add(new ArrayList()); //la index 1
            la.add(new ArrayList()); //la index 2
            la.add(new ArrayList()); //la index 3
            la.add(new ArrayList()); //la index 4
            
        la.get(0).add(1); 
        la.get(0).add(2);
        la.get(1).add(2);
        la.get(2).add(4);
        la.get(3).add(4);
    }
}