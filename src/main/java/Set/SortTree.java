package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortTree {

    Set<String> hashSet;
    public Set tree(){
        hashSet = new HashSet<String>();
        hashSet.add("Zubra");
        hashSet.add("Mjekula");
        hashSet.add("Samkelo");
        hashSet.add("Madida");
        hashSet.add("Amat");

        Set<String> treeSorted = new TreeSet<String>(hashSet);
        treeSorted.remove("Mjekula");
        return treeSorted;
    }
}
