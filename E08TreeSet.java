import java.util.*;

public class E08TreeSet{
    public static void main(String [] args){
        TreeSet<String> set = new TreeSet<String>();
        
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
