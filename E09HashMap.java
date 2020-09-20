import java.util.*;

public class E09HashMap{
    public static void main(String [] args){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        map.put(1,4);
        map.put(2,6);
        map.put(6,7);
        map.put(4,0);
        map.put(5,4);
        map.put(2,4); //cheia doi primeste valoarea 4, suprascrie valoarea 6 primita anterior
        
        //Cum parcurgem colectia, avand in vedere ca un for-each obisnuit nu poate parcurge cupluri de valori? Solutia:
        //Cheile sunt unice, deci am putea parcurge cheile, si parcurgand fiecare cheie in parte sa-i afisam valoarea.
        Set<Integer> set = map.keySet();
        for(Integer i: set){
            System.out.println(i+" "+map.get(i)); //map.get(i) inseamna returneaza valoarea de la cheia i din map
        }
    }
}
