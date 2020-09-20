import java.util.*;

public class E06HashSet{
    public static void main(String [] args){
        HashSet<String> set = new HashSet<String>();
        
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
