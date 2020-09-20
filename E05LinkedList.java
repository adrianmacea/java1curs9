import java.util.*;

public class E05LinkedList{
    public static void main(String [] args){
        LinkedList<Integer> lista = new LinkedList<Integer>();
        
        //ArrayList - lista simplu inlantuita vs LinkedList - lista dublu inlantuita
        
        lista.addFirst(4);
        lista.addFirst(6);
        lista.addFirst(2);
        lista.removeLast();
        lista.addFirst(8);
        lista.addLast(3);
        lista.addLast(8);
        lista.removeLast();
        lista.addFirst(1);
        lista.removeFirst();
        
        for(Integer i: lista){
            System.out.println(i); // 8 2 4 3
        }
        
        //List l1 = new ArrayList();
        //List l2 = new LinkedList();
        //mai sus avem o sintaxa mai veche, care nu se mai foloseste
        //prin polimorfism putem pune un ArrayList sau un LinkedList intr-o referinta de tip List, 
        //dar atentie, List nu este serializabil, adica nu poate fi trimis printr-un flux, deci nu poate fi stocat intr-n fisier etc
        //plus ar trebui sa aiba definit tipul generic ...
    }
}
