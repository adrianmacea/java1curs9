import java.util.*;

public class E07LinkedHashSet{
    public static void main(String [] args){
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        
        set.add("ion");
        set.add("gigel");
        set.add("maria");
        set.add("ana");
        set.add("marcel");
        set.add("ana");
        
        for(String s: set){
            System.out.println(s);
        }
    }
}
