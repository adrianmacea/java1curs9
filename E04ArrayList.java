import java.util.*;

public class E04ArrayList{
    public static void main(String [] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        lista.add(4);
        lista.add(1);
        lista.add(7);
        lista.add(4);
        lista.add(3);
        lista.add(4);
        
        //putem parcurgem lista in doua moduri 
        //prima metoda, un for-each, ia elemenele in ordine fara sa ia in considerare indexul
        //a doua metoda, un for simplu, parcurge fiecare index si preia elementul de acolo
        //(mai exista o metoda de parcurgere, cu iterator, dar nu se mai foloseste (de la v5?)
        for(Integer i: lista){
            System.out.println(i);
        }
        
        System.out.println("==========================="); // folosit acest delimitator ca sa vedem mai usor ce se intampla
        
        Collections.sort(lista); //sortare alfabetica
        Collections.sort(lista, Collections.reverseOrder()); //acceasi sortare dar cu reverseOrder
        
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        
        //pe baza rezultatului ne dam seama ca duplicatele se pastreaza, "4" apare de 3 ori in lista
        
    }
}
